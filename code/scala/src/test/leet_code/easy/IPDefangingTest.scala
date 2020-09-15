package leet_code.easy

import org.scalatest.funsuite.AnyFunSuite

class IPDefangingTest extends AnyFunSuite {
  test("Defang IP returns correct result") {
    assert(IPDefanging.defangIp("1.1.1.1") === "1[.]1[.]1[.]1")
    assert(IPDefanging.defangIp("1.1") === "1[.]1")
  }
}
