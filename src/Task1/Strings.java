package Task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Strings {

    public static void main(String[] args) {
//        secondVariant(new String[]{"q","w","e","r"});
//        reverseInteger(1234);
//        reverseString(new String[]{"q","w","e","r"});
//        System.out.println(findFirstUniqueElement("qwertqwertqwertyqwertyqwertys"));
//        System.out.println(isAnagram("qwert", "trwqe"));
//        System.out.println(isPalindrome(".Qw,er,/r+ew-q"));
//        System.out.println(strToStr("qweertyswweertfsklkgslwerst", "wert"));
        List<Character> charList = "qwerty".chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        charList.forEach(System.out::println);
    }


    public static void reverseString(String[] charArray){
        String newString = Arrays.toString(charArray);
        StringBuilder stringBuilder = new StringBuilder(newString).reverse()
                .deleteCharAt(0)
                .deleteCharAt(newString.length() - 2);
        System.out.println(stringBuilder.toString());
    }

    public static void secondVariant(String[] charArray){
        String abstractNumb;
        for (int i = 0; i < charArray.length/2; i++) {
            abstractNumb = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = abstractNumb;
        }
        Arrays.stream(charArray).forEach(System.out::println);
    }

    public static void reverseInteger(int x){
        StringBuilder intString = new StringBuilder(((Integer) x).toString()).reverse();
    }

    public static int findFirstUniqueElement(String str) {
        char[] stingCharArray = str.toCharArray();
        Arrays.sort(stingCharArray);
        for (int i = 1; i < stingCharArray.length - 1; i++) {
            if (stingCharArray[i] != stingCharArray[i + 1] && stingCharArray[i] != stingCharArray[i - 1])
                return str.indexOf(stingCharArray[i]);
        }
        return -1;
    }

    public static boolean isAnagram(String str, String firstString){
        for (int i = 0; i < str.length(); i++) {
            if(firstString.indexOf(str.charAt(i)) != -1 && str.length() == firstString.length()) return true;
        }
        return false;
    }

    public static boolean isPalindrome(String str){
        String s1 = str.toLowerCase().replaceAll("[^a-z]", "");
        String s2 = new StringBuilder(s1).reverse().toString();
        return s2.equals(s1);
    }

    public static int strToStr(String string, String partOfString){
        String newString = string.replaceFirst(partOfString, "*");
        for (int i = 0; i < newString.length(); i++) {
            if(newString.charAt(i) == '*') return i;
        }
        return -1;
    }

    public static String commonPrefix(String[] strings){
        if (strings.length == 0) return "";

        String prefix = strings[0];

        for (int i = 1; i < strings.length; i++)
            while (strings[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }

        return prefix;
    }

}
