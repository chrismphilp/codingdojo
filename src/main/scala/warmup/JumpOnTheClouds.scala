package warmup

object JumpOnTheClouds {
  def jumpingOnClouds(c: Array[Int]): Int = {
    var minNumberOfJumps = 0
    var currentJumpIndex = 0
    for (currentJumpIndex to c.length - 2) {
      if (c(currentJumpIndex + 2) == 1) {
        minNumberOfJumps += 1
        currentJumpIndex += 1
      }
      else minNumberOfJumps += 1
    }
    minNumberOfJumps
  }
}
