package 三大工厂模式.抽象工厂模式;

import 三大工厂模式.工厂方法模式.IFarmFactory;
import 三大工厂模式.工厂方法模式.IProduct;

/**
 * @author Lil
 * @date 2021/11/9 22:42
 */
public class SouthFarmFactory implements IFactory {

    public IApple createApple() {
        return new SouthApple();
    }

    public IOrange createOrange() {
        return new SouthOrange();
    }
}
