package cn.legeyung.study04;

/**
 * String.concat()将指定字符串联到此字符串的结尾
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class Lianjie {
    public static void main(String[] args) {
        String str = "Hello ";
        String s = "World ";
        String b = "!";

        String a = str.concat(s);
        String c = str.concat(str).concat(b);

        System.out.println(a);
        System.out.println(c);
    }
}

