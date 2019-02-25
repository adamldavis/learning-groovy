yieldUnescaped '<!DOCTYPE html>'
html {
  head {
    meta(charset:'utf-8')
    title("Ratpack: $title")

    meta(name: 'apple-mobile-web-app-title', content: 'Ratpack')
    meta(name: 'description', content: '')
    meta(name: 'viewport', content: 'width=device-width, initial-scale=1')

    link(href: '/images/favicon.ico', rel: 'shortcut icon')
    link(href: '/styles/main.css', rel: 'stylesheet')
    link(href: '/styles/index.css', rel: 'stylesheet')
  }
  body (id: 'posts') {

    p id: 'date', class: 'date', "${new Date()}"
    header {
      img(src: '/images/favicon.ico', class: '')
      h1 'Ratpack'
      p 'Simple, lean &amp; powerful HTTP apps'
    }

    section {
      h3 title
      p 'This is the main page for your Ratpack app.'
    }

    section {
        h4 'This Example Uses the Following'
        ul(id: 'links') {
            li { a href: 'http://groovy-lang.org/', 'Groovy' }
            li { a href: 'https://gradle.org', 'Gradle' }
            li { a href: 'https://ratpack.io/', 'Ratpack' }
            li { a href: 'https://www.groocss.org/', 'GrooCSS' }
        }
    }

    footer {
        a href: 'https://adamldavis.com/', 'Created by Adam L. Davis'
    }
  }
}
