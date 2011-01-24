package app.demo

class Person {

  static hasMany = {tasks: Task}

  String firstName
  String lastName
  List tasks
  static constraints = {
    firstName blank: false, nullable: false
  }
}
