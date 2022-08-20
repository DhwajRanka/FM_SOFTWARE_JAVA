import java.util.*;

public class Q7_A {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        String str1, str2;
        boolean check = false;  
        System.out.println("Enter string 1: ");
        str1 = sc.nextLine();
        System.out.println("Enter string 2: ");
        str2 = sc.nextLine();
        check = str1.equals(str2);
        if(check)
        {
            System.out.println("The strings are equal");
        }
        else {
            System.out.println("The strings are not equal");
        }
     sc.close();
    }
}