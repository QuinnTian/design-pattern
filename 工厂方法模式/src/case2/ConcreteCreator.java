package case2;

/**
 * <pre></pre>
 *
 * @author QuinnTian
 * @since
 */
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createPoduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName((c.getName())).newInstance();
        }catch (Exception e){

        }
        return (T)product;
    }
}
