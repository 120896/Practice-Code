import java.util.Scanner;

public class EvenNatural {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%2==0){
                System.out.println("Even Number");
            }
           // System.out.println("Even N Namuber");
            else{
                System.out.println("Not Even Number");
            }
        }
    }
}
