public class Stesting {
    public static void main(String[] args) {

    }

    //Author: Trayi Chaganti
    //Description: This function is used to merge two strings
    public static String merge(String s1, String s2)
    {
        StringBuilder result = new StringBuilder();
        if(s1== "" || s2== "")
            return "error";
        for(int i = 0; i < s1.length() || i < s2.length(); i++){
            if(i < s1.length())
                result.append(s1.charAt(i));
            if(i < s2.length())
                result.append(s2.charAt(i));

        }
        return result.toString();
    }
    //Author: Trayi Chaganti
    //Description: This function is used to check if number is palindrome or not
    public static String palindrome(int num){
        String str = String.valueOf(num);
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i++) != str.charAt(j--)){
                return "no";
            }
        }
        return "yes";
    }
    // Author: Ankhit Tangella
    // Description: This function is used to give the length of the string

    public String LengthString(String s1) {
        int len = s1.length();
        return String.valueOf(len);
    }

    // Author: Ankhit Tangella
    // Description: This fuction is used to reverse the string

    public String ReverseString(String original){
        StringBuilder sb = new StringBuilder(original);
        sb.reverse();
        return sb.toString();
    }




}









