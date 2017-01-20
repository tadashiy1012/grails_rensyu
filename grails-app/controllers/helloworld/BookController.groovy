package helloworld

class BookController {

    def index() { 
        def b = new Book(name: 'hoge')
        b.save()
        def all = Book.all
        render all
    }
}
