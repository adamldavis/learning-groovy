package example

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class PostController {

    PostService postService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond postService.list(params), model:[postCount: postService.count()]
    }

    def show(Long id) {
        respond postService.get(id)
    }

    def create() {
        respond new Post(params)
    }

    def save(Post post) {
        if (post == null) {
            notFound()
            return
        }

        try {
            postService.save(post)
        } catch (ValidationException e) {
            respond post.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'post.label', default: 'Post'), post.id])
                redirect post
            }
            '*' { respond post, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond postService.get(id)
    }

    def update(Post post) {
        if (post == null) {
            notFound()
            return
        }

        try {
            postService.save(post)
        } catch (ValidationException e) {
            respond post.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'post.label', default: 'Post'), post.id])
                redirect post
            }
            '*'{ respond post, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        postService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'post.label', default: 'Post'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'post.label', default: 'Post'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
