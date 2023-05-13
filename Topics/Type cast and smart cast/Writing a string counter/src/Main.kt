fun countStrings(list: List<Any>): Int {
    // make your code here
    var count = 0
    for (l in list) {

        if (l is String) {
            count++
        }
        if ((l !is String)) {
            continue
        }

    }
    return count
}