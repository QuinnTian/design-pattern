package case1;

/**
 * <pre></pre>
 *
 * @author QuinnTian
 * @since
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑色人种也会说话啊！");
    }
}
