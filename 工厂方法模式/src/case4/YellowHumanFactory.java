package case4;

/**
 * <pre></pre>
 *
 * @author QuinnTian
 * @since
 */
public class YellowHumanFactory implements AbstractFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
