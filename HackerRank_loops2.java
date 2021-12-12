import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int r=0;
            int s=0;
            for(int j=0;j<n;j++){
                int m=(int)Math.pow(2,j);
                if(j==0){
                     s=a+m*b;
                }
                else{
                    s=m*b;
                }
                r=r+s;
              
            System.out.print(r + " ");  
            }
            System.out.println();
            
        }
        in.close();
    }
}

