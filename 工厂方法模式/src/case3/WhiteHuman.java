package case3;

/**
 * <pre></pre>
 *
 * @author QuinnTian
 * @since
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤是白色的。");

    }

    @Override
    public void talk() {
        System.out.println("白色人种在说话。");

    }
}
