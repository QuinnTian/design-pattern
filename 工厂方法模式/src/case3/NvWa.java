package case3;

/**
 * <pre></pre>
 *
 * @author QuinnTian
 * @since
 */
public class NvWa {
    public static void main(String[] args){
        /*创建白色人种*/
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
    }
}
