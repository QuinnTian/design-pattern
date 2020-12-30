package case2;

/**
 * <pre>场景类</pre>
 *
 * @author QuinnTian
 * @since
 */
public class Client {
    public static void main(String args[]){
        Creator creator = new ConcreteCreator();
        Product product = creator.createPoduct(ConcreteProduct1.class);
        /*......*/
    }
}
