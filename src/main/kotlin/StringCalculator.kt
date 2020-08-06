class StringCalculator {

    fun add(numbers: String): Int {
        val integers = numbers.split(",").map { it.toInt() }
        return integers.sum()
    }

}
