import java.util.*

class Practice {
    fun romanToInt(s: String): Int {

        val romanMap: MutableMap<Char, Int> = HashMap()

        romanMap['I'] = 1
        romanMap['V'] = 5
        romanMap['X'] = 10
        romanMap['L'] = 50
        romanMap['C'] = 100
        romanMap['D'] = 500
        romanMap['M'] = 1000

        val size = s.length
        var num = romanMap[s[size-1]]!!

        for(i in size - 2 downTo 0){
            if(romanMap[s[i]]!! >= romanMap[s[i + 1]]!!){
                num += romanMap[s[i]]!!
            } else{
                num -= romanMap[s[i]]!!
            }
        }
        return num
    }
}

fun main(args:Array<String>)
{
    val x = Practice()
    val reader =  readLine()!!
    x.romanToInt(reader)
}