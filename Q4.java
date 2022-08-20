import java.util.*;

public class Q4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String recd=sc.next();
        char[] recdarr=recd.toCharArray();
        int count=0;
        for(char c:recdarr){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                count=count+1;
            }
        }
        System.out.println("The number of vowels is "+ count);
        sc.close();
    }
}