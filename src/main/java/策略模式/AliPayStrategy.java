package 策略模式;

import java.math.BigDecimal;

/**
 * @author Lil
 * @date 2021/11/17 22:28
 */
public class AliPayStrategy implements IPayStrategy {
    public boolean pay(int money) {
        System.out.println("支付宝支付1000元");
        return true;
    }

    public BigDecimal queryBlance() {
        System.out.println("余额20");
        return new BigDecimal("20");
    }
}
