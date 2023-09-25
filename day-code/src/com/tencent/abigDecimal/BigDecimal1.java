package com.tencent.abigDecimal;
import java.math.BigDecimal;
public class BigDecimal1 {
    public static void main(String[] args) {
        BigDecimal db1 = BigDecimal.valueOf(10.2);
        BigDecimal db2 = BigDecimal.valueOf(10.2);
        System.out.println(db1.add(db2));
    }
}
