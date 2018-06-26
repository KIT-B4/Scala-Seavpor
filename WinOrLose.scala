object WinOrLose {
  def main(args: Array[String]): Unit = {
    val a1: Int = 5
    val a2: Int = 6
    val a3: Int = 200
    val b1: Int = 10
    val b2: Int = 6
    val b3: Int = 15

    println("Alis score is: Math = " + a1 + ", Physic = " + a2 + ", and Java = " + a3)
    println("Bob score is: Math = " + b1 + ", Physic = " + b2 + ", and Java = " + b3)

    if(a1 != b1){
      print("1 ")
    }
    if(a2 != b2){
      print("1 ")
    }
    if(a3 != b3){
      print("1 ")
    }
  }
}
