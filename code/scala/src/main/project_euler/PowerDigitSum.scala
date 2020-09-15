package project_euler

import java.math.BigInteger

object PowerDigitSum {
  def getPowerDigitSum(max: Int): Double = {
    var total: BigInteger = new BigInteger("0")
    val initial: BigInteger = new BigInteger("2")
    var store: BigInteger = initial.pow(max)
    while (store != BigInteger.ZERO) {
      total = total.add(store.remainder(new BigInteger("10")))
      store = store.divide(new BigInteger("10"))
    }
    total.doubleValue()
  }
}
