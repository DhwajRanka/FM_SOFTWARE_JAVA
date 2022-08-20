import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Q2_A {
    public static void main(String[] args) throws IOException{
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));  
        System.out.println("Enter a string: ");  
        String str = reader.readLine();
        System.out.println("Enter an integer: ");
        int num = Integer.parseInt(reader.readLine());
        System.out.println("Enter a character: ");
        char ch = reader.readLine().charAt(0);
        System.out.println("Enter a double: ");
        double db = Double.parseDouble(reader.readLine());

        System.out.println("The string taken was: "+str);  
        System.out.println("The int number taken was: "+num);
        System.out.println("The character taken was: "+ch);
        System.out.println("The double taken was: "+db);
    }
}