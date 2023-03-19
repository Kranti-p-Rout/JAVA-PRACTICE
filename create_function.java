import java.util.Scanner;
public class create_function {
/*    public static  int  factorial(int num){
        int fact=1;
        for (int i=1;i<=num;i++){
             fact=fact*i;
        }
       return fact;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();

        int factorial_n=factorial(n);
        int factorial_r=factorial(r);
        int factorial_nr=factorial((n-r));

        int ncr=(factorial_n)/((factorial_r)*(factorial_nr));
        System.out.println(ncr);
    }
}

 */
   public static int factorial(int num){
       int fact=1;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
   }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();

        int factorial_n= factorial(n);
        int factorial_r=factorial(r);
        int factorial_nr=factorial((n-r));

        int ncr= factorial_n/(factorial_r*factorial_nr);
        System.out.println(ncr);

    }

}