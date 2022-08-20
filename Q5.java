import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        int[] a = new int[50];
        System.out.println("Enter number of elements (n): ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i <n ; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(a[j]<a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The elements sorted using bubble sort are: ");
        for (int i = 0; i <n ; i++) {
            System.out.println(a[i]);
        }
     sc.close();
    }
}