object OneToNineteen
{
  def main(args: Array[String])
  {
    println("Input the age: ")
    val a=scala.io.StdIn.readInt()
    
    for( i <- 1 to a)
    {
      if(i%4 != 0)
      {
        println(i + " ")
      }
    }
  }
}

