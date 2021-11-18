package 三大工厂模式.简单工厂模式;

/**
 * @author Lil
 * @date 2021/11/9 11:24
 */
public class Test {
    public static void main(String[] args) throws Exception {
        SimpleFactory factory = new SimpleFactory();
        IProduct apple = factory.createProduct("apple");
        apple.grow();

        IProduct orange = factory.createProduct("orange");
        orange.grow();

        System.out.println("------------------------");

        SimpleFactory simpleFactory = new SimpleFactory();
        IProduct apple2 = simpleFactory.createProduct2(Apple.class);
        apple.grow();
        IProduct orange2 = simpleFactory.createProduct2(Orange.class);
        orange2.grow();
    }
}
