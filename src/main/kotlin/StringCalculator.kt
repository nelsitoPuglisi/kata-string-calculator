import java.lang.Exception
import java.lang.NumberFormatException

class StringCalculator {

    fun add(numbers: String): Int {
        return if (numbers.isEmpty())
            0
        else {
            val integers = numbers.split(",").map { toNumber(it) }
            integers.sum()
        }
    }

    private fun toNumber(it: String): Int {
        return it.trim().toInt()
    }

}
