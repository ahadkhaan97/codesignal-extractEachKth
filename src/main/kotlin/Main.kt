fun main() {
    solution(mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3).forEach {
        print("$it,")
    }
}

fun solution(inputArray: MutableList<Int>, k: Int): MutableList<Int> {
    val tempList = mutableListOf<Int>()
    var counter = k - 1
    for (i in 0 until inputArray.size) {
        if (i != counter) {
            tempList.add(inputArray[i])
        } else {
            counter += k
        }
    }
    return tempList
}