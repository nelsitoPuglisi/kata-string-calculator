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
}