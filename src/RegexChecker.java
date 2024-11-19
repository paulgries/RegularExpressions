import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexChecker {
    public static void main(String[] args) {
        //match one String against one regex
        System.out.println(Pattern.matches("([.w]){2}f", "..f"));
        System.out.println(Pattern.matches("[k*]a*b", "kaaaaabx"));

        //using a Matcher object to find matching substrings
        Pattern pattern = Pattern.compile("[a-c]\\+{5}\""); // \\+{5} becomes +{5} in the regex
        Matcher matcher = pattern.matcher("a1bb\\\\c2a4\\\\b+++++\"6c89\\\\c+++++\"");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        //using the String method "matches" to check if a String matches a regex
        String str = "Hello_World11";
        boolean isSame = str.matches("(Hello)\\w.*(1)\\2");
        System.out.println(isSame);
    }
}
