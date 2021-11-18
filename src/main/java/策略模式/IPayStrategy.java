package 策略模式;

import java.math.BigDecimal;

/**
 * @author Lil
 * @date 2021/11/17 22:27
 */
public interface IPayStrategy {
    boolean pay(int money);
    BigDecimal queryBlance();
}
