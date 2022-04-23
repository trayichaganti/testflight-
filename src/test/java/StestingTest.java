
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class StestingTest {
    public static Stesting obj;

    @BeforeClass
    public static void setup() {
        obj = new Stesting();
    }

    //Author: Trayi Chaganti
    //Description: This test case is used to merge two strings.
    @Test
     public void testmerge1(){
        assertEquals("Staomy", obj.merge("Sam", "toy"));
    }
}







