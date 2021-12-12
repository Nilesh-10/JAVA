import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int c=s1.length();
                //Complete this line
                if(c<15){
                    for(int j=c;j<15;j++){
                        s1=s1 + " ";
                    }
                if(x>=0 && x<=9)
                {
                    System.out.println(s1  +"00" + x);
                }
                else if(x>=10 && x<=99){
                    System.out.println(s1 + "0" +x);
                }
                else{
                    System.out.println(s1 + x);
                }
            }
            }
            System.out.println("================================");

    }
}



