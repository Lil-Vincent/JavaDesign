package 简单工厂模式;

/**
 * @author Lil
 * @date 2021/11/9 11:23
 */
public class SimpleFactory {
    public IProduct createProduct(String productType) {
        if ("apple".equals(productType)) {
            return new Apple();
        }else if ("orange".equals(productType)) {
            return new Orange();
        }
        return null;
    }

    public IProduct createProduct2(Class<? extends IProduct> clazz) throws Exception {
        if (null == clazz) {
            throw new Exception("无法识别产品");
        }
        return clazz.newInstance();
    }
}
