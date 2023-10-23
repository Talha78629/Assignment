
import java.util.*;
public class Roman
{
    public static void romann(String k)
    {
        Map<Character, Integer> map=new HashMap<Character, Integer>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        k = k.replace("IV","IIII");
        k = k.replace("IX","VIIII");
        k = k.replace("XL","XXXX");
        k = k.replace("XC","LXXXX");
        k = k.replace("CD","CCCC");
        k = k.replace("CM","DCCCC");
        int num = 0;

        for (int i = 0; i < k.length(); i++)
        {

            num = num + (map.get(k.charAt(i)));
        }

        System.out.println("The Integer value is: "+num);
    }
    //driver code
    public static void main (String args[])
    {
   Scanner sc=new Scanner(System.in);
   String k=sc.next();
        romann(k);
    }
}
