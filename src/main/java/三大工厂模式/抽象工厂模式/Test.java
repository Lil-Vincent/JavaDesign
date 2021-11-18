package 三大工厂模式.抽象工厂模式;

/**
 * @author Lil
 * @date 2021/11/9 22:44
 */
public class Test {
    public static void main(String[] args) {
        SouthFarmFactory southFarmFactory = new SouthFarmFactory();
        IApple apple = southFarmFactory.createApple();
        apple.growApple();

        IOrange orange = southFarmFactory.createOrange();
        orange.growOrange();
    }
}
