import kotlin.math.ceil
import kotlin.math.sqrt

class CountPrime
{
    fun checkPrimeNumber(n: Int):Int
    {
        //No numbers less than 3 are prime
        if (n<3) return 0

        val limit = ceil(sqrt(n.toFloat())).toInt()

        //Here we can understand which number is already checked
        val loopCursor = BooleanArray(n) {false}
        var count = 1

        (3 until n step 2).forEach{ odd->
            if (!loopCursor[odd])
            {
                if (odd < limit) (odd * odd until n step odd * 2).forEach{loopCursor[it] =true}
                count++
            }
        }

        return count
    }
}


fun main(args: Array<String>)
{
    val x = CountPrime()
    println(x.checkPrimeNumber(10))
}