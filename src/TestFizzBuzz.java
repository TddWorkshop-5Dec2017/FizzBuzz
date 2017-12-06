import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestFizzBuzz
{
    FizzBuzz fizzBuzzer;

    @Before
    public void init()
    {
        fizzBuzzer = new FizzBuzz();
    }

    @Test
    public void fizzBuzzTest()
    {
        assertThat(fizzBuzzer.fizzBuzz(15), is(equalTo("FizzBuzz")));
    }
    @Test
    public void not3Not5MultipleTest()
    {
        assertThat(fizzBuzzer.fizzBuzz(44), is(equalTo("44")));
    }

    @Test
    public void fizzTest()
    {
        assertThat(fizzBuzzer.fizzBuzz(3), is(equalTo("Fizz")));
    }

    @Test
    public void buzzTest()
    {
        assertThat(fizzBuzzer.fizzBuzz(5), is(equalTo("Buzz")));
    }

    @Test
    public void zeroValueTest()
    {
        assertThat(fizzBuzzer.fizzBuzz(0), is(equalTo("0")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidArgumentTest()
    {
        fizzBuzzer.fizzBuzz(-10);
    }
}
