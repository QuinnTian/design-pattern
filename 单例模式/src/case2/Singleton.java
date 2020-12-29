package case2;

/**
 * <pre>单例模式通用代码</pre>
 *
 * @author QuinnTian
 * @since
 */
public class Singleton {
    /*限制产生多个对象*/
    private static final Singleton singleton = new Singleton();
    private Singleton(){}
    /*获取对象实例*/
    public static Singleton getSingleton(){
        return singleton;
    }
    /*该类的其他方法*/
    public static void doSomeing(){}
}
