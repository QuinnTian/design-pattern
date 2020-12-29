package case1;

/**
 * <pre></pre>
 *
 * @author QuinnTian
 * @since
 */
public class Minister {
    public static void main(String[] args){
        for(int day = 0;day<3;day++){
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
        /*运行输出三天见得皇帝是同一个人*/
    }
}
