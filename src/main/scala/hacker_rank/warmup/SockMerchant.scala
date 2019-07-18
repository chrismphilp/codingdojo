package hacker_rank.warmup

import scala.collection.mutable

object SockMerchant {
  def sockMerchant(n: Int, ar: Array[Int]): Int = {
    val sockStore: mutable.HashMap[Int, Int] = new mutable.HashMap[Int, Int]()
    var pairCount = 0
    ar.foreach((value: Int) => {
      if (sockStore.contains(value)) {
        pairCount+=1
        sockStore.remove(value)
      }
      else sockStore.put(value, 1)
    })
    pairCount
  }
}
