package 三大工厂模式.抽象工厂模式;

/**
 * @author Lil
 * @date 2021/11/9 22:39
 */
public interface IFactory {
    IApple createApple();
    IOrange createOrange();
}
