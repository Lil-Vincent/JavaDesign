package 七大设计原则.里氏替换原则;

/**
 * @author Lil
 * @date 2021/11/8 11:16
 * fly 方法变成了在 8000 米高空飞翔（普通鸟类达不到），
 * 这就改变了父类的行为，导致替换不成立，所以这个例子就违背了里氏替换原则。
 */
public class LspTest {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Eagle eagle = new Eagle();
        eagle.fly();
    }
}
