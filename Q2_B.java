import java.util.*;

public class Q2_B {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        int number = sc.nextInt();
        char ch = sc.next().charAt(0);
        double db = sc.nextDouble();
        System.out.println("The string taken was: "+ str);
        System.out.println("The int number taken was: "+ number);
        System.out.println("The character taken was: "+ ch);
        System.out.println("The double taken was: "+ db);
	  sc.close();
    }
}