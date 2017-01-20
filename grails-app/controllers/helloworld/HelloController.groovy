package helloworld

class HelloController {

    def index() {
        def ls = []
        (1..5).each { ls.add 'Hello World! ' }
        render ls.join()
    }
}
