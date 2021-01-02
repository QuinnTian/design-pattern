package case1;

/**
 * <pre></pre>
 *
 * @author QuinnTian
 * @since
 */
public abstract class AbstractYellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄人种的皮肤是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种也会说话啊！");
    }
}
