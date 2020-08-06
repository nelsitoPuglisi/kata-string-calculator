import org.assertj.core.api.Assertions.*
import org.junit.Test

class MySampleShould {

    @Test
    fun `have a failing sample`() {
        //given
        val mySample = MySample()
        //when
        val actual = mySample.greetings("Alice")
        //then
        val expected = "Hello Alice!"
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `have an expected exception sample`() {
        //given
        val mySample = MySample()
        //when
        //then
        assertThatThrownBy { mySample.greetings("") }
            .hasMessage("Name is required")
    }
}