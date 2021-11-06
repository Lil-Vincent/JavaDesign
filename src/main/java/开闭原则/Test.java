package 开闭原则;

/**
 * @author Lil
 * @date 2021/11/6 22:02
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("打折前" + new Cabbage().getPrice());
        System.out.println("打折前" + new 打折蔬菜().getPrice());
    }
}
