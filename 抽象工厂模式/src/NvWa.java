/**
 * <pre></pre>
 *
 * @author QuinnTian
 * @since
 */
public class NvWa {
    public static void main(String args[]){
        /*第一条生产线，男性生产线*/
        HumanFactory maleHumanFactory = new MaleFactory();
        /*第二条生产线，女性生产线*/
        HumanFactory femaleHumanFactory = new FemaleFactory();
        /*生产线建立完毕，开始生产人*/
        /*生产第一个黄人男性*/
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        /*生产第二个黄人女性*/
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
    }
}
