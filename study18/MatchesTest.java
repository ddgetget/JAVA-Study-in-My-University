package org.gaozou.book.javaabc.examples.ch18;

/**
 * @author TuringEmmy
 *
 */
public class MatchesTest {
    public static void main(String[] args) {
        //创建用字符串表示的正则表达式
        String paterStr = "\\d{4}-\\d{2}-\\d{2}";
        //创建两个待匹配的字符串
        String s1 = "9999-66-88";
        String s2 = "内容是9999-66-88";
        //对字符串s1进行匹配检查
        if (s1.matches(paterStr)) {
            //匹配成功的情况
            System.out.println("恭喜你，字符串s1满足指定格式的匹配要求");
        } else {
            //匹配成功的情况
            System.out.println("测试失败，字符串s1未能满足指定格式的匹配要求");
        }
        if (s2.matches(paterStr)) {
            //匹配成功的情况
            System.out.println("恭喜你，字符串s2满足指定格式的匹配要求");
        } else {
            //匹配成功的情况
            System.out.println("测试失败，字符串s2未能满足指定格式的匹配要求");
        }
    }
}
