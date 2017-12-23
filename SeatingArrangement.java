/* IMPORTANT: Multiple classes and nested static classes are supported */

 // uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int test=Integer.parseInt(sc.nextLine());
        int a[]=new int[test];
        int b[]=new int[test];
        for(int i=0;i<test;i++){
            a[i]=Integer.parseInt(sc.nextLine());
            b[i]=a[i]%12;
            if(b[i]==0){
                b[i]=12;
            }
            int count;
            String s="AS";
            if(b[i]<7){
                count=(6-b[i])*2+1;
                a[i]+=count;
            }
            else{
                count=(b[i]-7)*2+1;
                a[i]-=count;
            }
            b[i]%=6;
            if(b[i]==1 || b[i]==0){
                s="WS";
            }
            else if(b[i]==2 || b[i]==5){
                s="MS";
            }
            System.out.println(a[i]+" "+s);
        }
        
    }
}
