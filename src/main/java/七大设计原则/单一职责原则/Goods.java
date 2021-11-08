package 七大设计原则.单一职责原则;

/**
 * @author Lil
 * @date 2021/11/8 16:20
 */
public class Goods {
    public void sale(String type) {
        if ("进货".equals(type)){
            System.out.println("去进货");
        }else if ("卖货".equals(type)) {
            System.out.println("去卖货");
        }
    }
}
