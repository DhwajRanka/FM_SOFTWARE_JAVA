import java.util.*;

public class Q8 {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int num, remainder, num_copy;
        int rev_num = 0;
        System.out.println("Enter an integer: ");  
        num=sc.nextInt();
        num_copy = num; 

        while (num != 0) {
            remainder = num % 10;
            rev_num = rev_num * 10 + remainder;
            num = num/ 10;
        }

        if (num_copy == rev_num){  
            System.out.printf("The number "+num_copy+" is a palindrome");
        }else{
            System.out.printf("The number "+num_copy+" is not a palindrome");
        }
      sc.close();
    }
}