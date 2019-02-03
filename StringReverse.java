import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int i=0;
        boolean flag = true;
        char[] ch = A.toCharArray();
        while(i<=(A.length()/2)){
            if(ch[i] != ch[A.length() - 1 - i]){
                flag = false;
                break;
            }
            i++;
        }
        if(flag){
            System.out.print("Yes");
        }
        else
            System.out.print("No");
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
