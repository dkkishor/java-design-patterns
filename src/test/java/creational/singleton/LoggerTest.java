package creational.singleton;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoggerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testLoggerHash() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("Logger1 Hash: " + logger1.hashCode());
        System.out.println("Logger2 Hash: " + logger2.hashCode());
        Assert.assertEquals(logger1.hashCode(), logger2.hashCode());
    }
}