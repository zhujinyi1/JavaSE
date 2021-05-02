import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;//精度极高的数据
//常用于财务数据
//财务数据中double不够用，用bidgecimal
//属于引用数据类型
//需要new对象

public class TestBigDecimal {
    public static void main(String[] args) {
        BigDecimal v1 = new BigDecimal(100);
        BigDecimal v2 = new BigDecimal(200);
        BigDecimal v3 = v1.add(v2);
        System.out.println(v3);
    }


}
