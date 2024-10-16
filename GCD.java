import java.io.*;
import java.util.*;
 public class GCDRec{
    int gcd(int m,int n){
        if(m>n){
            return gcd(n,m);
        }
        if(m==n){
            return m;
        }
        if(m==0){
            return n;
        }
        if(m==1){
            return 1;
        }
        return gcd(m,n%m);
        }
        public static void main(String args[]){
            GCDRec ob=new GCDRec();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter two numbers find the GCD");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int g=ob.gcd(a,b);
            System.out.println("GCD of given numbers is"+g);
            
        }
    }
