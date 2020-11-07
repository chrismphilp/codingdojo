package leet_code.easy

object MaximumProductOfTwoElementsInAnArray {
  def maxProduct(nums: Array[Int]): Int = {
    scala.util.Sorting.quickSort(nums)
    (nums(nums.length - 1) - 1) * (nums(nums.length - 2) - 1)
  }
}
