package 三大工厂模式.工厂方法模式;

/**
 * @author Lil
 * @date 2021/11/9 22:27
 */
public class Test {
    public static void main(String[] args) {
        IFarmFactory appleFactory =  new AppleFactory();
        IProduct apple = appleFactory.create();
        apple.grow();

        OrangeFactory orangeFactory = new OrangeFactory();
        IProduct orange = orangeFactory.create();
        orange.grow();
    }
     
     
}
