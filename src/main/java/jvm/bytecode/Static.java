package jvm.bytecode;

/**
 * static按代码顺序执行
 */
public class Static {

    static int a = 0;
    static {
        a = 1;
        b = 1;
    }
    //赋值了两次, 且先赋值为1, 再赋值为0, 所以b输出为0
//    static int b = 0;
    static int b;//只赋值了一次

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }

}
