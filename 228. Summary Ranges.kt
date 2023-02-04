class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        val result = mutableListOf<String>()
        if (nums.isEmpty()) return result
        var start = nums[0]
        var end = nums[0]
        for (i in 1 until nums.size) {
            if (nums[i] == end + 1) {
                end = nums[i]
            } else {
                result.add(if (start == end) "$start" else "$start->$end")
                start = nums[i]
                end = nums[i]
            }
        }
        result.add(if (start == end) "$start" else "$start->$end")
        return result
    }
}
