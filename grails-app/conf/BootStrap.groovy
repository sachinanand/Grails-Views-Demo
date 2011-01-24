import app.demo.Person
import app.demo.Task
import app.demo.Task

class BootStrap {

  def init = { servletContext ->
    Task activity1 = new Task(name: "Task1")
    Task activity2 = new Task(name: "Task2")
    Task activity3 = new Task(name: "Task3")
    Task activity4 = new Task(name: "Task4")
    activity1.save()
    activity2.save()
    activity3.save()
    activity4.save()
    Person person1 = new Person(firstName: "Sachin", lastName: "Anand").save()
    Person person2 = new Person(firstName: "Vivek", lastName: "Krishna").save()
    Person person3 = new Person(firstName: "Himanshu", lastName: "Seth").save()
    person1.tasks=[]
    person1.tasks << activity1
    person1.tasks << activity2
    person1.save()
    person2.tasks=[]
    person2.tasks << activity2
    person2.tasks << activity3
    person2.save()
    person3.tasks=[]
    person3.tasks << activity3
    person3.tasks << activity4
    person3.save()
  }
  def destroy = {
  }
}
