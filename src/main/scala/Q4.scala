import scala.io.StdIn.readInt
object Q4 {

  def evenOdd(n : Int): String = {

    if(n == 0){
      "Even"
    }
    else if(n == 1){
      "Odd"
    }
    else{
      evenOdd(n-2)
    }

  }

  def main(args: Array[String]): Unit = {

    printf("Enter any number: ")
    var num = readInt()
    var result = evenOdd(num)
    printf("Given number is " + result)

  }

}
