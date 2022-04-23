public class Stesting {

    //AUTHOR:
    //Description:
    public static String merge(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        if (s1 == "" || s2 == "")
            return "error";
        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
            if (i < s1.length())
                result.append(s1.charAt(i));
            if (i < s2.length())
                result.append(s2.charAt(i));

        }
        return 0;
    }
}


