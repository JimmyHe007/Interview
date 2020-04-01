package algorithm.unit1;

/**
 * 反转字符串
 */
public class ConverseStr {

    public static void main(String[] args) {

        String str = "algorithm";
        str = converse(str);
        System.out.println(str);
    }

    public static String converse(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;
        for (int i = 0; i < chars.length; i++) {
            //数组个数分别为奇数和偶数时跳出循环的条件
            if ((length-i-1) == i || length/2 == i) {
                break;
            }
            char temp = chars[i];
            chars[i] = chars[length-i-1];
            chars[length-i-1] = temp;
        }
        return new String(chars);
    }

}
