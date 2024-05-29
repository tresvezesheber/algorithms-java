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

        HashMap<Character, Integer> stringMap1 = new HashMap<>();
        HashMap<Character, Integer> stringMap2 = new HashMap<>();

        for (int i = 0; i < string1.length(); i++) {
            char character = string1.charAt(i);
            if (stringMap1.containsKey(character)) {
                stringMap1.put(character, stringMap1.get(character) + 1);
            } else {
                stringMap1.put(character, 1);
            }
        }

        for (int i = 0; i < string2.length(); i++) {
            char character = string2.charAt(i);
            if (stringMap2.containsKey(character)) {
                stringMap2.put(character, stringMap2.get(character) + 1);
            } else {
                stringMap2.put(character, 1);
            }
        }

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


}
