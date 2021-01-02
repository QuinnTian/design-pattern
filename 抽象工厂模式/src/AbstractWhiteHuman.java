/**
 * <pre></pre>
 *
 * @author QuinnTian
 * @since
 */
public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤是白色的！");
    }

    @Override
    public void talk() {
        System.out.println("白色人也会说话啊！");

    }
}
