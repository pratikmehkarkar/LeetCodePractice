class PlusOne {
    fun mySqrt(x: Int): Int {
        var leftNum = 0
        var rightNum = x.toLong()
        var mid:Long
        var answer:Long = 0
        while (leftNum <= rightNum){
            mid = (leftNum + rightNum)/2
            if(mid * mid == x.toLong()){
                return mid.toInt()
            }
            if(mid * mid > x){
                rightNum = mid - 1
            } else{
                answer = answer.coerceAtLeast(mid)
                leftNum = (mid + 1).toInt()
            }
        }
        return answer.toInt()
    }
}
fun main(args:Array<String>)
{
    val x = PlusOne()
    print(x.mySqrt(4))
}
