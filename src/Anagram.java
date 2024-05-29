import java.util.HashMap;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("hello", "ollEh"));
    }

    public static boolean isAnagram(String string1, String string2) {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        if (string1.length() != string2.length()) {
            return false;
        }

        HashMap<Character, Integer> stringMap1 = getMap(string1);
        HashMap<Character, Integer> stringMap2 = getMap(string2);

        System.out.println(stringMap1);
        System.out.println(stringMap2);

        for (char key : stringMap1.keySet()) {
            if (!stringMap2.containsKey(key)) {
                return false;
            }
            if (stringMap1.get(key) != stringMap2.get(key)) {
                return false;
            }
        }

        return true;
    }

    public static HashMap<Character, Integer> getMap(String string) {
        HashMap<Character, Integer> stringMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (stringMap.containsKey(character)) {
                stringMap.put(character, stringMap.get(character) + 1);
            } else {
                stringMap.put(character, 1);
            }
        }
        return stringMap;
    }

    public static boolean isAnagramRecursive(String string1, String string2) {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        if (string1.length() != string2.length()) {
            return false;
        }

        if (string1.length() == 0) {
            return true;
        }

        char firstChar = string1.charAt(0);
        int indexInString2 = string2.indexOf(firstChar);

        if (indexInString2 == -1) {
            return false;
        }

        String newString1 = string1.substring(1);
        String newString2 = string2.substring(0, indexInString2) + string2.substring(indexInString2 + 1);

        return isAnagramRecursive(newString1, newString2);
    }
}
