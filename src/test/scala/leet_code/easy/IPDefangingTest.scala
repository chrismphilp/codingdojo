package leet_code.easy

import org.scalatest.FunSuite

class IPDefangingTest extends FunSuite {
  test("Defang IP returns correct result") {
    assert(IPDefanging.defangIp("1.1.1.1") === "1[.]1[.]1[.]1")
    assert(IPDefanging.defangIp("1.1") === "1[.]1")
  }
}
