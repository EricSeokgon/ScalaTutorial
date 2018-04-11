class Person(val name: String, var age: Int)

object Mutablevariable {
  def main(args: Array[String]): Unit = {

    val p = new Person("Dean Wampler", 29)
    println(p.name)
    println(p.age)
    p.age = 30
    println(p.age)
  }

}
