class LcfProblem {
        fun longestCommonPrefix(strs: Array<String>): String {
            if(strs.isEmpty()){
                return ""
            }
            var a = ""
            for(i in 0 until strs[0].length){
                val ch = strs[0][i]
                for (str in strs){
                    if(str.length <= i){
                        return a
                    }
                    if(ch != str[i]){
                        return a
                    }
                }
                a += ch
            }
            return a
        }
}
fun main(args:Array<String>)
{
    val x = LcfProblem()
    var array: Array<String> = arrayOf("flower","flow","flight")
    println(x.longestCommonPrefix(array))
}