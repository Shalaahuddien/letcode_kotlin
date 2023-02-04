class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val map1 = hashMapOf<Char, Char>()
    val map2 = hashMapOf<Char, Char>()
    for (i in s.indices) {
        val c1 = s[i]
        val c2 = t[i]
        if (map1.containsKey(c1)) {
            if (map1[c1] != c2) return false
        } else {
            map1[c1] = c2
        }
        if (map2.containsKey(c2)) {
            if (map2[c2] != c1) return false
        } else {
            map2[c2] = c1
        }
    }
    return true
}

}