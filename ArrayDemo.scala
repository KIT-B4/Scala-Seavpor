object ArrayDemo{
  def main(args: Array[String]): Unit = {
    var array = new Array[Int](5)
    var biggest: Integer = 0
    var sum: Integer = 0

    println("Please input your array: ")
    for(i <- 0 to 4){
      array(i) = scala.io.StdIn.readInt();
    }
    for(i <- 0 to 4){
      sum += array(i)
      if( array(i) > biggest )
        biggest = array(i)
    }
    
    println("The sum of an array is: " + sum)
    println("The biggest number of array is: " + biggest)
  }
}
