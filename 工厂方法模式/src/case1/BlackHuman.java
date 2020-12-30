package case1;

/**
 * <pre>黑色人种</pre>
 *
 * @author QuinnTian
 * @since
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤是黑色的。");
    }

    @Override
    public void talk() {
        System.out.println("黑人正在说话..");

    }
}
