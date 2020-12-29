package case1;

/**
 * <pre>皇帝类</pre>
 *
 * @author QuinnTian
 * @since
 */
public class Emperor {
    /*初始化一个皇帝，静态和最终关键字是关键*/
    private static final Emperor emperor = new Emperor();
    /*皇帝类的构造方法*/
    private Emperor(){}
    /*静态方法用于获取皇帝的对象*/
    public static Emperor getInstance(){
        return  emperor;
    }
    /*皇帝说话*/
    public static void say(){
        System.out.println("我就是皇帝某某.....");
    }
}
