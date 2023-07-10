import scala.io.StdIn.readInt
object Q2 {

  def prime(n: Int, div: Int = 2): Boolean = {
    if (n <= 1) {
      false
    } else if (n == 2) {
      true
    } else if (n % div == 0) {
      false
    } else if (div * div > n) {
      true
    } else {
      prime(n, div + 1)
    }

  }

  def primeSeq(n: Int): Unit = {
    if (n > 1)
      primeSeq(n - 1)
      if (prime(n))
        println(n)
  }

  def main(args: Array[String]): Unit = {

    printf("Enter any number: ")
    var num = readInt()
    primeSeq(num)

  }

}
