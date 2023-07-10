import scala.io.StdIn.readInt
object Q3 {

  def sum(n: Int): Int = {
    if(n == 1) 1
    else n + sum(n-1)
  }

  def main(args: Array[String]): Unit = {

    printf("Enter any number: ")
    var num = readInt()
    var result = sum(num)
    printf("Sum is: "+ result)

  }

}
