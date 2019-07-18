package project_euler.difficulty.lower

import scala.annotation.tailrec
import scala.collection.mutable

object CollatzSequence {
    var storedValues: mutable.HashMap[Double, Double] = new mutable.HashMap[Double, Double]()

    def getLongestCollatzSequence(max: Int): Double = {
        var longestCollatz: Double = 0
        var lengthOfSequence: Double = 0
        for (x <- 1 to max) {
            val lengthOfCollatz: Double = getCollatzSequenceLength(x, 0)
            storedValues.put(x, lengthOfCollatz)
            if (lengthOfCollatz > lengthOfSequence) {
                lengthOfSequence = lengthOfCollatz
                longestCollatz = x
            }
        }
        longestCollatz
    }

    @tailrec
    def getCollatzSequenceLength(curr: Double, length: Int): Double = (curr, length) match {
        case (1, _) => length
        case (x, _) if hasStoredValues(x) => storedValues(x) + length
        case (x, y) if x % 2 == 0 => getCollatzSequenceLength(x / 2, y + 1)
        case (x, y) => getCollatzSequenceLength(x * 3 + 1, y + 1)
    }

    def hasStoredValues(value: Double): Boolean = {
        storedValues.contains(value)
    }
}
