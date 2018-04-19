package DataType

object TupleLiterals {
  def main(args: Array[String]): Unit = {
    val t = ("Hello", 1, 2.3)
    println("Peint the whole tuple: " + t)
    println("Peint the first item: " + t._1)
    println("Peint the second item: " + t._2)
    println("Peint the third item: " + t._3)

    val (t1, t2, t3) = ("world", "!", 0x22)
    println(t1 + ", " + t2 + ", " + t3)

    val (t4, t5, t6) = Tuple3("World", "!", 0x22)
    println(t4 + ", " + t5 + ", " + t6)

  }
}
