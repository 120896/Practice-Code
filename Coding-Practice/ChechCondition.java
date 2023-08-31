import java.util.Scanner;

public class ChechCondition {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //int a= sc.nextInt();
        //int b= sc.nextInt();
       // if(a==b){
        //    System.out.println("Equals");
      //  }
       // else if(a>b){
       //     System.out.println("a is greater");
       // }
       // else{
       //     System.out.println("b is greater");
      //  }
      int botton =sc.nextInt();
      switch (botton) {
        case 1:
            System.out.println("Hello");
            break;
        case 2:
        System.out.println("namste");
          break;
        case 3:
        System.out.println("Bajoure");
         break;  
        default:
        System.out.println("invalide");
            break;
      }
    }
}
