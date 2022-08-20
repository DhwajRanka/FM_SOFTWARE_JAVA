import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        int a,b,subresult;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a: ");  
        a=sc.nextInt();
        System.out.println("Enter b: ");  
        b=sc.nextInt();
        subresult=a+~b+1; 
        System.out.println("The result is: "+subresult);
    }
}