package leet_code.easy

import org.scalatest.funsuite.AnyFunSuite

class FlippingAnImageTest extends AnyFunSuite {
  test("Flipping An Image returns correct result for examples") {
    assert(FlippingAnImage.flipAndInvertImage(Array(Array(1, 1, 0), Array(1, 0, 1), Array(0, 0, 0))) ===
      Array(Array(1, 0, 0), Array(0, 1, 0), Array(1, 1, 1)))
    assert(FlippingAnImage.flipAndInvertImage(Array(Array(1, 1, 0, 0), Array(1, 0, 0, 1), Array(0, 1, 1, 1), Array(1, 0, 1, 0))) ===
      Array(Array(1, 1, 0, 0), Array(0, 1, 1, 0), Array(0, 0, 0, 1), Array(1, 0, 1, 0)))
    assert(FlippingAnImage.flipAndInvertImage(Array(Array(1))) === Array(Array(0)))
  }
}
