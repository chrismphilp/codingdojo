package project_euler

class PowerDigitSumTest extends FunSuite {
  test("Power digit sum test") {
    assert(PowerDigitSum.getPowerDigitSum(10) === 7)
    assert(PowerDigitSum.getPowerDigitSum(15) === 26)
    assert(PowerDigitSum.getPowerDigitSum(25) === 29)
  }
}
