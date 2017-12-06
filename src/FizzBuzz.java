import com.sun.javaws.exceptions.InvalidArgumentException;

public class FizzBuzz
{
    public String fizzBuzz(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException( i + " is less than zero");
        }

        if (i == 0)
        {
            return "0";
        }

        if (i%15 == 0)
        {
            return "FizzBuzz";
        }
        if (i%3 == 0)
        {
            return "Fizz";
        }

        if (i%5 == 0)
        {
            return "Buzz";
        }
        return i+"";


    }
}
