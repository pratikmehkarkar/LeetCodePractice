class LengthOfString {
    fun lengthOfLastWord(s: String): Int {
        if(s.replace("", "").isEmpty()) {
            return 0
        } else{
            return s.split(" ").filter{it->it!=""}.reversed()[0].length
        }
    }
}
fun main(args:Array<String>)
{
    val x = LengthOfString()
    val reader =  readLine()!!
    x.lengthOfLastWord(reader)
}

