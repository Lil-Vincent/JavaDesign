package 简单工厂模式;

/**
 * @author Lil
 * @date 2021/11/9 11:24
 */
public class Test {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        IProduct apple = factory.createProduct("apple");
        apple.grow();

        IProduct orange = factory.createProduct("orange");
        orange.grow();
    }
}
