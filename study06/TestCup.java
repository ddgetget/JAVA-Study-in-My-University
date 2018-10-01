package cn.legeyung.study06;

/**
 * 调用CupTest类进行
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class TestCup {
    public static void main(String[] args) {
        CupTest ct = new CupTest();
        ct.high = 15;
        ct.color = "红色";
        ct.price = 10.0;
        System.out.println("一个价格为" + ct.price +
                "元、高为" + ct.high + "厘米的"
                + ct.color + "杯子");
        ct.water();
    }
}
