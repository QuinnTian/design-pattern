package case3;



/**
 * <pre>简单工厂模式：去掉了抽象接口</pre>
 *
 * @author QuinnTian
 * @since
 */
public class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> c){
        /*定义一个生产出的人种*/
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}
