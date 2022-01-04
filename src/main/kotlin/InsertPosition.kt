class InsertPosition
{
    fun searchInsert(nums: IntArray, target: Int): Int
    {
        var position = 0
        val size = nums.size
        while (position < size)
        {
            //1>2,3>2,5>7,6>7
            if (nums[position] >= target)
            {
                return position
            }
            position ++
        }
        return position
    }
}
/*Input: nums = [1,3,5,6], target = 5
Output: 2
* */
fun main(args:Array<String>)
{
    val x = InsertPosition()
    val y = intArrayOf(1,3,5,6)
   // println(x.searchInsert(y,5))
   // println(x.searchInsert(y,2))
    println(x.searchInsert(y,7))
}
//(num)1<2(target)