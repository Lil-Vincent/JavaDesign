package 七大设计原则.里氏替换原则;

/**
 * @author Lil
 * @date 2021/11/6 22:10
 */
public class Eagle extends Bird {

    @Override
    public void fly() {
        System.out.println("我正在8000米高空飞翔");
    }
}
