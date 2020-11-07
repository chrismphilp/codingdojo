package leet_code.easy

object Maximum69Number {
  def maximum69Number(num: Int): Int = {
    num.toString.replaceFirst("6", "9").toInt
  }
}
