package project_euler

import org.scalatest.funsuite.AnyFunSuite

class CollatzSequenceTest extends AnyFunSuite {
  test("Collatz sequence length test") {
    assert(CollatzSequence.getCollatzSequenceLength(5, 0) === 5.0)
    assert(CollatzSequence.getCollatzSequenceLength(13, 0) === 9.0)
  }

  test("Collatz progression test") {
    assert(CollatzSequence.getLongestCollatzSequence(1000) === 871.0)
    assert(CollatzSequence.getLongestCollatzSequence(10000) === 6171.0)
    assert(CollatzSequence.getLongestCollatzSequence(100000) === 77031.0)
  }
}
