package 七大设计原则.依赖倒置原则;

/**
 * @author Lil
 * @date 2021/11/8 12:27
 */
public class SuperMarket {
    public void sale(IGoods goods) {
        goods.sale();
    }
}
