class Solution
{
    fun removeElements(head: ListNode?, `val`: Int): ListNode?
    {
        var cursor = head
        val a = ListNode(0)
        var headDummy = a
        while(cursor!=null)
        {
            if (cursor.`val` != `val`)
            {
                headDummy.next = ListNode(cursor.`val`)
                headDummy = headDummy.next
            }
            cursor = cursor.next
        }
        return a.next
    }
}
fun main(args:Array<String>)
{

}