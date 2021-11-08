package 七大设计原则.接口隔离原则;

/**
 * @author Lil
 * @date 2021/11/8 16:29
 */
public class Dog implements RunAni,SwingAni {
    public void run() {
        System.out.println("狗跑");
    }

    public void swim() {
        System.out.println("狗游泳");
    }
}
