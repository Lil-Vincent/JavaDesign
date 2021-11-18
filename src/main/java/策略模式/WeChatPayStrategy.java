package 策略模式;

import java.math.BigDecimal;

/**
 * @author Lil
 * @date 2021/11/17 22:30
 */
public class WeChatPayStrategy implements IPayStrategy{
    public boolean pay(int money) {
        System.out.println("微信支付300");
        return true;
    }

    public BigDecimal queryBlance() {
        System.out.println("微信余额199");
        return new BigDecimal(10);
    }
}
