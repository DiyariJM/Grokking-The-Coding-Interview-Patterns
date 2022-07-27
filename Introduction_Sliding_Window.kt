fun main(args: Array<String>){

    val intNumbers = arrayOf(1, 3, 2, 6, -1, 4, 1, 8, 2)
    var k = 5

    var firstFiveSum = 0;
    for(i in 0 until k)
        firstFiveSum += intNumbers[i]

    // printing the average of first sub array
    println(firstFiveSum.toDouble()/k)

    var startingElementSum = 0
    var endingElementSum = 0;
    for(j in 0 until intNumbers.size - k) {
        startingElementSum += intNumbers[j]
        endingElementSum += intNumbers[k + j]
        var sumAll = firstFiveSum - startingElementSum + endingElementSum
        // printing the average of the remaining sub arrays
        println(sumAll.toDouble()/k)
    }
}