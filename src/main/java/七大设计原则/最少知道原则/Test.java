package 七大设计原则.最少知道原则;

/**
 * @author Lil
 * @date 2021/11/8 17:09
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Manager manager = new Manager(new Cabbage());
        boss.select(manager);
    }
}
