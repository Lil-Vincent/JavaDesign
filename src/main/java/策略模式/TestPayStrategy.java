package 策略模式;

/**
 * @author Lil
 * @date 2021/11/17 22:32
 */
public class TestPayStrategy {


    public static void main(String[] args) {
        IPayStrategy PayStrategy;
        String payType = "ali";
        if (payType.equals("ali")) {
            PayStrategy = new AliPayStrategy();
        }else {
            PayStrategy = new WeChatPayStrategy();
        }
        PayStrategy.pay(10);
        PayStrategy.queryBlance();
    }
}
