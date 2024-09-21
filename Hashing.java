import java.util.HashSet;
import javax.sql.RowSet;
public class Hashing
{
    public static void main(String[] args){
        HashSet <Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(4)){
            System.out.println("does not contains");
        }
        System.out.println(set);
        set.remove(1);
        System.out.println(set);

    }
}