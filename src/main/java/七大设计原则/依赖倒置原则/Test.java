package 七大设计原则.依赖倒置原则;

/**
 * @author Lil
 * @date 2021/11/8 12:28
 */
public class Test {
    public static void main(String[] args) {
        SuperMarket superMarket = new SuperMarket();
        superMarket.sale(new Cabbage());
    }
}
