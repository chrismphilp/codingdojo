package project_euler.difficulty.lower

import scala.math.pow

object PythagoreanTriplet {
    def getPythagoreanTripletProduct(max: Int): Int = {
        for (x <- 1 to max) {
            for (y <- 1 to x) {
                for (z <- x to max) {
                    if (pow(y, 2) + pow(x, 2) == pow(z, 2)) {
                        val calc = x+y+z
                        if (calc == 1000) return x*y*z
                    }
                }
            }
        }
        0
    }
}
