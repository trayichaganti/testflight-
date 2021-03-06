
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
    //Description: This test case is used to test the merging strings function
    @Test
    public void testmerge2(){
        assertEquals("StAoMy",obj.merge("SAM","toy"));
    }
    //Author: Trayi chaganti
    //Description: This test case is used to test the merging strings function
    @Test
    public void testmerge3(){
        assertEquals("error",obj.merge("","toy"));
    }
    //Author: Trayi chaganti
    //Description: This test case is used to test the palindrome function
    @Test
    public void testpalindrome1(){
        assertEquals("yes",obj.palindrome(121));
    }



    //Author: Trayi chaganti
    //Description: This test case is used to test merge two strings function
    @Test
    public void testpalindrome2() {
        assertEquals("no", obj.palindrome(123));
    }

    //Author: Trayi chaganti
    //Description: This test case is used to test merge two strings function
    @Test
    public void testpalindrome3() {
        assertEquals("yes", obj.palindrome(111));
    }

    //Author: Ankhit Tangella
    //Description: This test case is used to test the length of the string function
    @Test
    public void testlength1() {
        assertEquals("7", obj.LengthString("testing"));
    }

    //Author: Ankhit Tangella
    //Description: This test case is used to test the length of the string function
    @Test
    public void testlength2() {
        assertEquals("3", obj.LengthString("hii"));
    }

    //Author: Ankhit Tangella
    //Description: This test case is used to test the length of the string function
    @Test
    public void testlength3() {
        assertEquals("4", obj.LengthString("test"));
    }

    //Author: Ankhit Tangella
    //Description: This test case is used to test the reverse string function
    @Test
    public void testreverse1() {
        assertEquals("hi", obj.ReverseString("ih"));
    }

    //Author: Ankhit Tangella
    //Description: This test case is used to test the reverse string function
    @Test
    public void testreverse2() {
        assertEquals("ankhit", obj.ReverseString("tihkna"));
    }

    //Author: Ankhit Tangella
    //Description: This test case is used to test the reverse string function
    @Test
    public void testreverse3() {
        assertEquals("nm", obj.ReverseString("mn"));
    }

    //Author: Bhavya Yaddula
    //Description: This test case is used to test the uppercase count function
    @Test
    public void testUpperCase1() {
        assertEquals("2", obj.UppercaseCount("SalT"));

    }

    //Author: Bhavya Yaddula
    //Description: This test case is used to test the uppercase count function
    @Test
    public void testUpperCase2() {
        assertEquals("0", obj.UppercaseCount("sal"));

    }

    //Author: Bhavya Yaddula
    //Description: This test case is used to test the uppercase count function
    @Test
    public void testUpperCase3() {
        assertEquals("3", obj.UppercaseCount("SAT"));

    }

    //Author: Bhavya Yaddula
    //Description: this test case is used to test the lowercase count function
    @Test
    public void testLowerCase1() {
        assertEquals("2", obj.LowercaseCount("SalT"));

    }

    //Author: Bhavya Yaddula
    //Description: this test case is used to test the lowercase count function
    @Test
    public void testLowerCase2() {
        assertEquals("0", obj.LowercaseCount("ST"));

    }

    //Author: Bhavya Yaddula
    //Description: this test case is used to test the lowercase count function
    @Test
    public void testLowerCase3() {
        assertEquals("3", obj.LowercaseCount("lll"));

    }

    //Author: Trayi Chaganti
    //Description: This test case is used to test both reverse string and length of string functions
    @Test
    public void integrationtest1() {

        assertEquals("4", obj.ReverseString(obj.LengthString("toys")));
    }

    // Author: Ankhit tangella
    // Description: This test case is used to test both the uppercase count and reverse string functions
    @Test
    public void integrationtest2() {
        assertEquals("2", obj.ReverseString((obj.UppercaseCount("SaT"))));
    }

    // Author: Bhavya Yaddula
    // Description: This test case is used to test both the Uppercase and lowercase count functions
    @Test
    public void intergrationtest3() {
        assertEquals("0", obj.UppercaseCount(obj.LowercaseCount("HIII")));
    }
}










