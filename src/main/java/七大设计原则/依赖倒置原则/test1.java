package 七大设计原则.依赖倒置原则;

/**
 * @author Lil
 * @date 2021/11/8 14:27
 */
public class test1 {
    static int a = 0;

    public static void main(String[] args) {
        int b = a;
        a = 100;
        System.out.println(b);
    }
}
