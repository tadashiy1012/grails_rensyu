package helloworld

class MemberController {
  def index() {
    render(view: 'index')
  }
  def hoge() {
    [hoge: 'hoge']
  }
  def all() {
    def all = Member.all
    [all: all]
  }
  def list() {
    def all = Member.all
    [all: all]
  }
  def create() {}
  def execCreate() {
    String name = params.name
    def member = new Member(name: name)
    member.save()
    render 'create success!'
  }
  def delete() {}
  def execDelete() {
    def id = params.id
    def m = Member.get(id)
    if (m != null) {
      m.delete(flush: true)
    }
    render 'delete success!'
  }
  def update() {
    def id = request['id']
    def m = Member.get(id)
    if (m != null) {
      render status: 404
    } else {
      [tgt: m]
    }
  }
  def execUpdate() {
    def id = params.id
    def m = Member.get(id)
    if (m != null) {
      m.name = params.name
      m.save()
      render 'update success!'
    } else {
      render 'update failed!'
    }
    

  }
}