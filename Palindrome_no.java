public class palindrome_no {
    public static void main(String args[])
    {
        int num,rem,d,n;
        num=351;
        rem=0;
        n=num;
        while(n!=0)
        {
            d=n%10;
            rem=rem*10+d;
            n=n/10;
        }
        if(rem==num)
        System.out.print("Palindrome no.");
        else
        System.out.println("Not Palindrome no.");


    }
    
}
