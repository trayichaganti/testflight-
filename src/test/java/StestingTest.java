
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class StestingTest {
    public static Stesting obj;

    @BeforeClass
    public static void setup() {
        obj = new Stesting();
    }

    //Author: Trayi chaganti
    //Description: This test case is used to test merge two strings function
    @Test
    public void testmerge1(){
        assertEquals("Staomy", obj.merge("Sam", "toy"));



    }
    //Author: Trayi Chaganti
    // Description: This test case is used to test the palindrome funtion
    @Test
    public void testpalindrome1(){
        assertEquals(true, obj.palindrome(121));

    }
}








