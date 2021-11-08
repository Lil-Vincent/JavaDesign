package 七大设计原则.单一职责原则;

/**
 * @author Lil
 * @date 2021/11/8 16:24
 */
public class Test {
    public static void main(String[] args) {
        Goods goods = new Goods();
        goods.sale("进货");
        goods.sale("卖货");

        进货 进货 = new 进货();
        进货.sale();
        卖货 卖货 = new 卖货();
        卖货.sale();
    }
}
