package leet_code.easy

import scala.collection.immutable.HashSet

object JewelsAndStones {
  def numJewelsInStones(J: String, S: String): Int = {
    val jewelStore = HashSet[Char](J.toSeq: _*)
    S.foldRight(0)((c: Char, i: Int) => {
      if (jewelStore.contains(c)) i + 1 else i
    })
  }
}
