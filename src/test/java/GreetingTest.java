import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Filip on 2017-11-24.
 */
public class GreetingTest {

    private Greeting testedObject;

    @Before
    public void setUp(){
        testedObject = new Greeting();
    }

    @Test
    public void shouldReturnCorrectGreetings() throws Exception {
        assertEquals("Hello world!", testedObject.passGreetings(GreetingType.HELLOWORLD));
        assertEquals("Hello people!", testedObject.passGreetings(GreetingType.HELLOPEOPLE));
        assertEquals("Hello guys!", testedObject.passGreetings(GreetingType.HELLOGUYS));
        assertEquals("Hello kids!", testedObject.passGreetings(GreetingType.HELLOKIDS));
    }
}
