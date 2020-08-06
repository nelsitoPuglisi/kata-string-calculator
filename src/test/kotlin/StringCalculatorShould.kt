import org.assertj.core.api.Assertions.*
import org.junit.Before
import org.junit.Test

class StringCalculatorShould {
    private lateinit var calculator: StringCalculator

    @Before
    fun setup() {
        calculator = StringCalculator()
    }

    @Test
    fun `add two numbers separated by comma`() {
        //given
        //when
        val actual = calculator.add("1,2")
        //then
        val expected = 3
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `return 0 when input is empty`() {
        //given
        //when
        val actual = calculator.add("")
        //then
        val expected = 0
        assertThat(actual).isEqualTo(expected)
    }
}