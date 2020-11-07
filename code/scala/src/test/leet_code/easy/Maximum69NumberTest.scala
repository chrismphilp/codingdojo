package leet_code.easy

import org.scalatest.funsuite.AnyFunSuite

class Maximum69NumberTest extends AnyFunSuite {
  test("Maximum69Number returns correct example results") {
    assert(Maximum69Number.maximum69Number(9669) === 9969)
    assert(Maximum69Number.maximum69Number(9996) === 9999)
    assert(Maximum69Number.maximum69Number(9999) === 9999)
  }
}
