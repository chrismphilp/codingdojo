package leet_code.easy

import org.scalatest.funsuite.AnyFunSuite

class MaximumProductOfTwoElementsInAnArrayTest extends AnyFunSuite{
  test("Correct results returned for examples") {
    assert(MaximumProductOfTwoElementsInAnArray.maxProduct(Array(3,4,5,2)) === 12)
    assert(MaximumProductOfTwoElementsInAnArray.maxProduct(Array(1,5,4,5)) === 16)
    assert(MaximumProductOfTwoElementsInAnArray.maxProduct(Array(3,7)) === 12)
  }
}
