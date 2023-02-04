class Solution {
    fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val sCount = IntArray(26)
    val tCount = IntArray(26)
    for (i in s.indices) {
        sCount[s[i] - 'a']++
        tCount[t[i] - 'a']++
    }
    return sCount.contentEquals(tCount)
}

}