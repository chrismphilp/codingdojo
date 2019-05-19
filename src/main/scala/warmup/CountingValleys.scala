package warmup

object CountingValleys {
  def countingValleys(n: Int, s: String): Int = {
    var valleyCount = 0
    var currentProgress = 0
    var inValley = false

    s.foreach((char: Char) => {
      if (currentProgress == 0) inValley = false
      else if (currentProgress == 1 && !inValley) {
        valleyCount += 1
        inValley = true
      }
      if (char == 'D') currentProgress += 1
      else currentProgress -= 1
    })
    valleyCount
  }
}
