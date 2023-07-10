import scala.io.StdIn.readInt
object Q1 {

  def prime(n: Int, div: Int): Boolean = {
    if (n <= 1) {
      false
    } else if (n == 2) {
      true
    } else if (n % div == 0) {
      false
    } else if (div * div > n) { //no smaller divisor can be found
      true
    } else {
      prime(n, div + 1)
    }

  }

  def main(args: Array[String]): Unit = {

    printf("Enter any number: ")
    var num = readInt()
    var result = prime(num, 2)
    printf(result.toString)

  }

}
