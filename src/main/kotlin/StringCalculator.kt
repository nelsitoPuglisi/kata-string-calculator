import java.lang.Exception
import java.lang.NumberFormatException

class StringCalculator {

    fun add(numbers: String): Int {
        return if (numbers.isEmpty())
            0
        else {
            DefaultSplitter(numbers).sum()
        }
    }

}

class DefaultSplitter(private val numbers: String) {

    fun sum(): Int {
        return numbers.split(*mutableListOf(",", "\n").toTypedArray()).map { toNumber(it) }.sum()
    }

    private fun toNumber(it: String): Int {
        return it.trim().toInt()
    }
}
