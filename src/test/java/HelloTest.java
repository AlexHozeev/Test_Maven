import hello.Hello;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();


    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testSayHello() {
        Hello hello = new Hello();
        hello.sayHello();

        Assert.assertNotEquals("pup", outputStream.toString());
    }

    @Test
    public void testSum(){
        Hello hello = new Hello();
        Assert.assertEquals(4,hello.sum(2,2));
        Assert.assertNotEquals(6,hello.sum(3,2));
    }

    @After
    public void cleanUp() {
        System.setOut(null);
    }

}
