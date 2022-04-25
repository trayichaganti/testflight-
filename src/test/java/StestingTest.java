
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StestingTest
{
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

    //Author: Ankhit Tangella
    //Description: This test case is used to test the length of the string function
    @Test
    public void testlength1(){
        assertEquals("7" , obj.LengthString("testing"));
    }

    //Author: Ankhit Tangella
    //Description: This test case is used to test the reverse string function
    @Test
    public void testreverse1(){
        assertEquals("hi" , obj.ReverseString("ih"));
    }
    //Author: Bhavya Yaddula
    //Description: This test case is used to test the Uppercase count function
    @Test
    public void testUpperCase1(){
        assertEquals("2",obj.UppercaseCount("SalT"));
        }
    //Author: Bhavya Yaddula
    //Description: This test case is used to test the Lowercase count funtcion
    @Test
    public void testLowerCase1(){
        assertEquals("2",obj.LowercaseCount("SalT"));
    }
}







