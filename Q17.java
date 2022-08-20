import java.util.Scanner;

public class Q17 {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the length of the array: ");  
        int n=sc.nextInt();
        int[] takearr = new int[n];
        char[] c = new char[n];
        char[] takech=new char[n];
        int[] showarr = new int[n];
        System.out.println("Enter an array: ");  
        for(int i=0; i<n;i++){
            takearr[i]=sc.nextInt();
        }
        for(int i=0; i<n;i++){  
            c[i]=(char)takearr[i];
        }
        System.out.println("The corresponding string is: ");  
        for(int i=0; i<n;i++){
            System.out.print(c[i]);
        }
        System.out.println("\nEnter length of string: ");  
        int num=sc.nextInt();
        System.out.println("Enter  a string: ");  
        String str = sc.next();
        System.out.println("The corresponding array is: ");
        takech=str.toCharArray();  
        for(int i=0; i<num;i++){ 
            showarr[i]=(int)takech[i];
        }
        for(int i=0; i<num;i++){ 
            System.out.println(" "+showarr[i]);
        }
    }
}