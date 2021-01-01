package case4;

/**
 * <pre></pre>
 *
 * @author QuinnTian
 * @since
 */
public class WhiteHumanFactory implements AbstractFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
