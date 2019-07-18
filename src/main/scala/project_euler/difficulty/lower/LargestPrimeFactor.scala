package project_euler.difficulty.lower

object LargestPrimeFactor {
    def findLargestPrimeFactor(value: Double): Double = {
        var currentValue = value
        var highestCurrentPrimeFactor = 0.0
        while (currentValue != 1) {
            var x = 2d
            while (x <= currentValue) {
                if (isPrime(x)) {
                    if (currentValue % x == 0) {
                        if (x > highestCurrentPrimeFactor) {
                            highestCurrentPrimeFactor = x
                        }
                        currentValue = currentValue / x
                    }
                }
                x += 1d
            }
        }
        highestCurrentPrimeFactor
    }

    def isPrime(value: Double): Boolean = {
        for (x <- 2d until value - 1d by 1d; if value % x == 0) return false
        true
    }
}
