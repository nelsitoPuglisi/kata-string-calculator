import org.assertj.core.api.Assertions.*
import org.junit.Test

class StringCalculatorShould {
    @Test
    fun `add two numbers separated by comma`() {
        //given
        val calculator = StringCalculator()
        //when
        val actual = calculator.add("1,2")
        //then
        val expected = 3
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `return 0 when input is empty`() {
        //given
        val calculator = StringCalculator()
        //when
        val actual = calculator.add("")
        //then
        val expected = 0
        assertThat(actual).isEqualTo(expected)
    }
}