package case1;

/**
 * <pre></pre>
 *
 * @author QuinnTian
 * @since
 */
public class NvWa {
    public static void main(String args[]){
        /*模拟女娲造人*/
        AbstractHumanFactory abstractHumanFactory = new HumanFactory();
        System.out.println("第一次造出的人是黑人");
        Human blackHuman = abstractHumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();;
        blackHuman.talk();

        System.out.println("第二次造出的人是白人");
        Human whiteHuma = abstractHumanFactory.createHuman(WhiteHuman.class);
        whiteHuma.getColor();
        whiteHuma.talk();

        System.out.println("第三次造出的人是黄人");
        Human yellowHuman = abstractHumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }

}
