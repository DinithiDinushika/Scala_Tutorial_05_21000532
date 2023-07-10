import scala.io.StdIn.readInt
object Q5 {

  def evenAddition(n : Int): Int = {

    if(n == 0)
      0
    else if(n%2 == 0)
      n + evenAddition(n-2)
    else
      evenAddition(n-1)

  }

  def main(args: Array[String]): Unit = {

    printf("Enter any number: ")
    var num = readInt()
    var result = evenAddition(num)
    printf("Addition of even numbers is: " + result)

  }

}
