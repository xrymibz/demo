import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/7 0007.
 */
public class First {
    public static  void  main(String args[]){
        System.out.print("hahaha");
        List<Integer> gogo = new ArrayList<Integer>();
        for(int i=0;i<20;i++){
       //     System.out.println(i);
            gogo.add(i);
        }

        for(int  i : gogo){
            System.out.println(i);
        }

    }
}
