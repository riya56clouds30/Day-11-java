import java.util.*;
public class removeandclearoperationinarraylist{
    public static void main(String args[]){
        ArrayList<Integer>a=new ArrayList<>();
        a.add(90);
        a.add(89);
        a.add(767);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}