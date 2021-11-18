package 策略模式;

/**
 * @author Lil
 * @date 2021/11/17 23:46
 */
public class test {
    //撒旦打撒
    public static void main(String[] args) {
        IPayStrategy iPayStrategy = PayEnum.getValue("aliPay");
        iPayStrategy.queryBlance();
        iPayStrategy.pay(10);
    }
}
