package app.demo

class Task {

  String name
  static constraints = {
    name blank: false, nullable: false
  }
}
