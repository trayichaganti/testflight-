
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
    //Description: This test case is used to test merge two strings function
    @Test
    public void testmerge1(){
        assertEquals("Staomy", obj.merge("Sam", "toy"));

    }
    //Author: Trayi chaganti
    //Description: This test case is used to test merge two strings function@Test
    public void testmerge2(){
        assertEquals("StAoMy",obj.merge("SAM","toy"));
    }
    //Author: Trayi chaganti
    //Description: This test case is used to test merge two strings function @Test
    public void testmerge3(){
        assertEquals("error",obj.merge("","toy"));
    }
    //Author: Trayi Chaganti
    // Description: This test case is used to test the palindrome funtion
    @Test
    public void testpalindrome1(){
        assertEquals("yes", obj.palindrome(121));

    }
    //Author: Trayi chaganti
    //Description: This test case is used to test merge two strings function@Test
    public void testpalindrome2(){
        assertEquals(false,obj.palindrome(123));
    }
    //Author: Trayi chaganti
    //Description: This test case is used to test merge two strings function@Test
    public void testpalindrome3(){
        assertEquals(true,obj.palindrome(111));
    }

    //Author: Ankhit Tangella
    //Description: This test case is used to test the length of the string function
    @Test
    public void testlength1(){
        assertEquals("7", obj.LengthString("testing"));
    }
    @Test
    public void testreverse1(){
        assertEquals("hi", obj.ReverseString("ih"));
    }

    //Author: Bhavya Yaddula
    //Description: This test case is used to test the uppercase count function
     @Test
     public void testUpperCase1(){
        assertEquals("2",obj.UppercaseCount("SalT"));

    }
     //Author: Bhavya Yaddula
     //Description: this test case is used to test the lowercase count function
     @Test
     public void testLowerCase1(){
        assertEquals("2",obj.LowercaseCount("SalT"));

    }
}







