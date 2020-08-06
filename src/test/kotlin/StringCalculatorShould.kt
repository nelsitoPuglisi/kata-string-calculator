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

    @Test
    fun `return same number when input has only one value`() {
        //given
        //when
        val actual = calculator.add("2")
        //then
        val expected = 2
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `add two numbers separated by space and comma`() {
        //given
        //when
        val actual = calculator.add("1 , 2")
        //then
        val expected = 3
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `sum more than two numbers`() {
        //given
        //when
        val actual = calculator.add("1, 2, 3")
        //then
        val expected = 6
        assertThat(actual).isEqualTo(expected)
    }
}