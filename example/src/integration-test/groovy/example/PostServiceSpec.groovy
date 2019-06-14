package example

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PostServiceSpec extends Specification {

    PostService postService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Post(...).save(flush: true, failOnError: true)
        //new Post(...).save(flush: true, failOnError: true)
        //Post post = new Post(...).save(flush: true, failOnError: true)
        //new Post(...).save(flush: true, failOnError: true)
        //new Post(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //post.id
    }

    void "test get"() {
        setupData()

        expect:
        postService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Post> postList = postService.list(max: 2, offset: 2)

        then:
        postList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        postService.count() == 5
    }

    void "test delete"() {
        Long postId = setupData()

        expect:
        postService.count() == 5

        when:
        postService.delete(postId)
        sessionFactory.currentSession.flush()

        then:
        postService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Post post = new Post()
        postService.save(post)

        then:
        post.id != null
    }
}
