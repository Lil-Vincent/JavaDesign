package 三大工厂模式.工厂方法模式;

/**
 * @author Lil
 * @date 2021/11/9 22:26
 */
public class OrangeFactory implements IFarmFactory {
    public IProduct create() {
        return new Orange();
    }
}
