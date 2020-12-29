package case2;

/**
 * <pre>通用单例类-线程不安全</pre>
 *
 * @author QuinnTian
 * @since
 */
public class SingletonUnSafe {
    public static  SingletonUnSafe singletonUnSafe = null;
    public SingletonUnSafe(){}
    public static SingletonUnSafe singletonUnSafe(){
        if( singletonUnSafe == null){
            singletonUnSafe  = new SingletonUnSafe();
        }
        return singletonUnSafe;
    }
}
