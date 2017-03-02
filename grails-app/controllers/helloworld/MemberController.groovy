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
      m.delete()
    }
    render 'delete success!'
  }
}