import java.util.Scanner;
public class Palindrome{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
	System.out.println("Enter any number");
        int num=snr.nextInt();
        int sum=0,rem,n=num;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(num==sum){
            System.out.println("Given number is a Palindrome number");
        }
        else{
            System.out.println("Given number is not a palindrome number");
        }
    }
}