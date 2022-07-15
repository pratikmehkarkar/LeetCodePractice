class ClimbingStairs {
    fun climbStairs(n: Int): Int {
        if(n<=2) return n

        var sum: Int = 0
        var num1 = 2
        var num2 = 1
        (3..n).forEach{ _ ->
            sum = num1 + num2
            num2 = num1
            num1 = sum
        }
        return sum
    }
}
fun main(args:Array<String>)
{
    val x = ClimbingStairs()
    print(x.climbStairs(4))
}