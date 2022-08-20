import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, temp, n;
        int[] a = new int[50];
        System.out.println("Enter number of elements (n): ");  
        n=sc.nextInt();
        System.out.println("Enter the elements of the array: "); 
        for (i = 0; i <n ; i++) {
            a[i] = sc.nextInt();
        }
        bubbleSort(a,n);  //Passing the array and number of elements to the method
    }
    public static void bubbleSort(int[] arr, int n){  
        int temp;
        int i,j;
        for(i = 0; i<n; i++) {
            for(j=i+1; j<n; j++) {
                if(arr[j]<arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The elements sorted using bubble sort are: ");  
        for (i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }
    }
}