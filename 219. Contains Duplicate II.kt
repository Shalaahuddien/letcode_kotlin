class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val set = HashSet<Int>()
    for (i in nums.indices) {
        if (i > k) set.remove(nums[i - k - 1])
        if (!set.add(nums[i])) return true
    }
    return false
}

}