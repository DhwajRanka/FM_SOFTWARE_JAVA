import java.util.Scanner;

public class Q13 {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        String str1, str2;
        System.out.println("Enter string 1: ");
        str1=sc.next();
        System.out.println("Enter string 2: ");  
        str2=sc.next();
        checkFunction(str1, str2);
    }
    public static void checkFunction(String s1, String s2){  
        if(s1.equalsIgnoreCase(s2)){
            if(s1.equals(s2)){
                System.out.println(0);
            }
            System.out.println(1);
        }
        else
            System.out.println(2);
    }
}