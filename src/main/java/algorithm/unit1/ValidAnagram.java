package algorithm.unit1;


/**
 * 248. 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 */
public class ValidAnagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        boolean result = compare(s, t);
        System.out.println(result);

    }

    public static boolean compare(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] letter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letter[s.charAt(i) - 'a'] ++;
            letter[t.charAt(i) - 'a'] --;
        }
        for (int i : letter) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

//    public static boolean compare(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        char[] schar = s.toCharArray();
//        char[] tchar = t.toCharArray();
//        Map<Character, Integer> distinct = new HashMap<>();
//        for (char c : schar) {
//            if (distinct.containsKey(c)) {
//                distinct.put(c, distinct.get(c)+1);
//            } else {
//                distinct.put(c, 1);
//            }
//        }
//        for (char c : tchar) {
//            if (distinct.containsKey(c)) {
//                if (distinct.get(c) > 0) {
//                    if (distinct.get(c) <= 1) {
//                        distinct.remove(c);
//                    } else {
//                        distinct.put(c, distinct.get(c)-1);
//                    }
//                }
//            } else {
//                return false;
//            }
//        }
//        if (distinct.size() > 0) {
//            return false;
//        } else {
//            return true;
//        }
//    }


}
