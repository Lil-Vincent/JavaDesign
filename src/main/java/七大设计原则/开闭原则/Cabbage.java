package 七大设计原则.开闭原则;

import java.math.BigDecimal;

/**
 * @author Lil
 * @date 2021/11/6 22:00
 */
public class Cabbage implements IGoods {
    public String getName() {
        return "蔬菜";
    }

    public BigDecimal getPrice() {
        return new BigDecimal("3.14");
    }
}
