class Solution
{
    fun isIsomorphic(s: String, t: String):Boolean
    {
        if (s.toSet().size != t.toSet().size)
        {
            return false
        }
        val stringSizeOne = s.length
        val stringSizeTwo = t.length

        val map = mutableMapOf<Char, Char>()
        for (i in 0 until stringSizeOne)
        {
            if(!map.containsKey(s[i]))
            {
                map[s[i]] = t[i]
            }
            else if (map[s[i]] != t[i])
            {
                return false
            }
        }
        return true
    }
}
fun main(args:Array<String>)
{
    val x = Solution()
    x.isIsomorphic("badc","baba")
}