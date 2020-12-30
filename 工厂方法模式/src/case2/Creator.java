package case2;

/**
 * <pre>抽象工厂类</pre>
 *
 * @author QuinnTian
 * @since
 */
public abstract class Creator {
    /**/
    public abstract <T extends Product> T createPoduct(Class<T> c);
}
