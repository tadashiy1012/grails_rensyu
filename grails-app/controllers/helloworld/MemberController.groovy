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
}