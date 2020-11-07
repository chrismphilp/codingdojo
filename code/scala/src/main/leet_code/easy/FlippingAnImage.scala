package leet_code.easy

object FlippingAnImage {
  def flipAndInvertImage(A: Array[Array[Int]]): Array[Array[Int]] = {
    val innerLength: Int = A(0).length
    val innerHalfLength: Int = innerLength / 2
    val isOdd = innerLength % 2 == 1

    for (i <- A.indices) {
      for (j <- 0 until innerHalfLength) {
        val tmp: Int = A(i)(j)
        A(i)(j) = if (A(i)(innerLength - 1 - j) == 1) 0 else 1
        A(i)(innerLength - 1 - j) = if (tmp == 1) 0 else 1
      }
      if (isOdd) {
        A(i)(innerLength / 2) = if (A(i)(innerLength / 2) == 1) 0 else 1
      }
    }
    A
  }
}
