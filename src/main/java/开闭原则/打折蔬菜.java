package 开闭原则;

import java.math.BigDecimal;

/**
 * @author Lil
 * @date 2021/11/6 22:01
 */
public class 打折蔬菜 implements IGoods {

    public String getName() {
        return "蔬菜";
    }

    public BigDecimal getPrice() {
        return new BigDecimal("1.1111");
    }
}
