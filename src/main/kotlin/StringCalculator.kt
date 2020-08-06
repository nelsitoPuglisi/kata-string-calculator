class StringCalculator {

    fun add(numbers: String): Int {
        return if (numbers.isNullOrEmpty())
            0
        else {
            val integers = numbers.split(",").map { it.toInt() }
            integers.sum()
        }
    }

}
