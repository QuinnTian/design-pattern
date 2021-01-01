package case4;

/**
 * <pre></pre>
 *
 * @author QuinnTian
 * @since
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤是黄色的。");

    }

    @Override
    public void talk() {
        System.out.println("黄色人种正在说话。");

    }
}
