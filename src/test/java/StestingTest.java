
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StestingTest {
    public static Stesting obj;

    @BeforeClass
    public static void setup() {
        obj = new Stesting();
        assertNotEquals(obj, null);
    }

    //Author: Trayi chaganti
    //Description: This test case is used to test the merging strings function
    @Test
    public void testmerge1(){
        assertEquals("Staomy", obj.merge("Sam", "toy"));
    }
    //Author: Trayi chaganti
    //Description: This test case is used to test the palindrome function
    @Test
    public void testpalindrome1(){
        assertEquals("yes",obj.palindrome(121))
        ;
    }


}







