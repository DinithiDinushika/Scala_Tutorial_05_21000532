import scala.io.StdIn.readInt
object Q6 {

  def fibonacci(n : Int): Int = {

    if(n == 0) 0
    else if(n == 1) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  def fibonacciSeq(n: Int): Unit ={
    if(n > 0)
      fibonacciSeq(n-1)
    println(fibonacci(n))

  }

  def main(args: Array[String]): Unit = {

    printf("Enter any number: ")
    var num = readInt()
    //fibonacci series -> 0, 1, 1, 2, 3, 5, 8
    println(fibonacciSeq(num))

  }

}
