package leet_code.easy

import org.scalatest.funsuite.AnyFunSuite

class JewelsAndStonesTest extends AnyFunSuite {
  test("Correct number of Jewels should be returned") {
    assert(JewelsAndStones.numJewelsInStones("aB", "ABBBBa") === 5)
    assert(JewelsAndStones.numJewelsInStones("aB", "AAAAAA") === 0)
    assert(JewelsAndStones.numJewelsInStones("a", "aaaaa") === 5)
    assert(JewelsAndStones.numJewelsInStones("a", "") === 0)
  }
}
