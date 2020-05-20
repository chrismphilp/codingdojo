package project_euler

import org.scalatest.funsuite.AnyFunSuite

class PowerDigitSumTest extends AnyFunSuite {
  test("Power digit sum test") {
    assert(PowerDigitSum.getPowerDigitSum(10) === 7.0)
    assert(PowerDigitSum.getPowerDigitSum(15) === 26.0)
    assert(PowerDigitSum.getPowerDigitSum(25) === 29.0)
  }
}
