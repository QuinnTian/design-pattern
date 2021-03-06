package case1;

/**
 * <pre></pre>
 *
 * @author QuinnTian
 * @since
 */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {

        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {

        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {

        return new FemaleBlackHuman();
    }
}
