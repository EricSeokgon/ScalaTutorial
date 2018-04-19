package DataType

class StringLiterals {
  def main(args: Array[String]): Unit = {
    println("This is a test")
  }

  def hello(name: String) =
    s"""Welcom!
    Hello, $name@
    *(Star!!)
    |Hi.
    |whitespace.""".stripMargin

}
