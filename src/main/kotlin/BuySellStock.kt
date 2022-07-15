class BuySellStock {
    fun maxProfit(prices: IntArray): Int {
        var profit : Int = 0
        var startPoint : Int = prices[0]

        if (prices == null || prices.size <= 1) return 0

       for(i in 0 until prices.size){
           profit = Math.max(profit,prices[i] - startPoint)
           startPoint = Math.min(startPoint,prices[i])
       }
        return profit
    }
}
fun main(args : Array<String>){
    val x= BuySellStock()
    val prices = intArrayOf(2,1,2,0,1)
    println(x.maxProfit(prices))
}