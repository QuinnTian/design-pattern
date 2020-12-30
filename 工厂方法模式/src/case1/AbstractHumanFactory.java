package case1;

/**
 * <pre>创建人类的抽象工厂</pre>
 *
 * @author QuinnTian
 * @since
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
