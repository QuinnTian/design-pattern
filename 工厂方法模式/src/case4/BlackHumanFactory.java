package case4;

/**
 * <pre></pre>
 *
 * @author QuinnTian
 * @since
 */
public class BlackHumanFactory implements AbstractFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
