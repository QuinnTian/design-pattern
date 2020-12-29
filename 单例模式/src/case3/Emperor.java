package case3;

import java.util.ArrayList;
import java.util.Random;

/**
 * <pre>单例模式扩展：生成多个单例</pre>
 *
 * @author QuinnTian
 * @since
 */
public class Emperor {
    /*定义能够产生最多的单例的数目*/
    private  static int maxNumOfEmperor = 2;
    /*定义每个皇帝的名字*/
    private static ArrayList<String> nameList = new ArrayList<>();//高并发下使用vector
    /*定义一个列表容纳所有皇帝的实例*/
    private static ArrayList<Emperor> emperorArrayList = new ArrayList<>();
    /*当前皇帝的序列号*/
    private static int countNumOfEmperor = 0;
    /*默认构造方法*/
    private Emperor(){}
    /*构造方法*/
    private Emperor(String name){
        nameList.add(name);
    }

    /*产生所有对象*/
    static{
        for (int i = 0 ; i< maxNumOfEmperor;i++){
            emperorArrayList.add(new Emperor("皇帝，序号："+i));
        }
    }
    /*随机获得一个皇帝*/
    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return  emperorArrayList.get(countNumOfEmperor);
    }
    /*皇帝说话*/
    public static void say (){
        System.out.println(nameList.get(countNumOfEmperor));
    }
}
