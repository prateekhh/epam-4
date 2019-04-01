import java.util.*;

/* 
* @author Prateek Chauhan
*
*/

public class Solution2 {

    public static void main(String[] args) 
    {
        
        Scanner in = new Scanner(System.in);
       
        int string = in.nextInt();
        ArrayList <String> List1 = new ArrayList<String>();
        for(int i = 0 ; i< string ; ++i)
            List1.add(in.next());
        
        int query = in.nextInt();
        ArrayList <String> List2 = new ArrayList<String>();
        for(int i = 0 ; i< query ; ++i)
            List2.add(in.next());
        
        
        for(int i = 0 ; i <query ; ++i)
        {
            int count=0;
            for(int j=0 ; j<string ; ++j)
                {
                    if(List2.get(i).equalsIgnoreCase(List1.get(j)))
                        count++;
                }
            
            System.out.println(count);
        }
        
        in.close();
     
    }
}