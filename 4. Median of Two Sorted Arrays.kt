class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val m = nums1.size
        val n = nums2.size
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1)
        }

        var start = 0
        var end = m
        while (start <= end) {
            val partitionX = (start + end) / 2
            val partitionY = (m + n + 1) / 2 - partitionX
            val maxLeftX = if (partitionX == 0) Int.MIN_VALUE else nums1[partitionX - 1]
            val minRightX = if (partitionX == m) Int.MAX_VALUE else nums1[partitionX]
            val maxLeftY = if (partitionY == 0) Int.MIN_VALUE else nums2[partitionY - 1]
            val minRightY = if (partitionY == n) Int.MAX_VALUE else nums2[partitionY]
            when {
                maxLeftX <= minRightY && maxLeftY <= minRightX -> {
                    return if ((m + n) % 2 == 0) {
                        (maxOf(maxLeftX, maxLeftY) + minOf(minRightX, minRightY)).toDouble() / 2
                    } else {
                        maxOf(maxLeftX, maxLeftY).toDouble()
                    }
                }
                maxLeftX > minRightY -> end = partitionX - 1
                else -> start = partitionX + 1
            }
        }
        return 0.0
    }
}
