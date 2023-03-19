import java.util.Scanner;
public class function_1_ncr {
    public static void main(String[] args) {
   /*     Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int factorial_n=1;
          for (int i =1;i<=n;i++){
              factorial_n=factorial_n*i;
          }
        int factorial_r=1;
          for (int i =1;i<=r;i++){
              factorial_r=factorial_r*i;
          }
          int  factorial_nr=1;
          for (int i =1;i<=(n-r);i++){
              factorial_nr=factorial_nr*i;
          }

          int result=factorial_n/(factorial_r*factorial_nr);
        System.out.println(result);

    */

      /*  Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int factorial_n=1;
         for (int i=1;i<=n;i++){
             factorial_n=factorial_n*i;

         }

         int factorial_r=1;
          for (int i=1;i<=r;i++){
              factorial_r=factorial_r*i;
          }

          int factorial_nr=1;
           for (int i=1;i<=(n-r);i++){
               factorial_nr=factorial_nr*i;
           }
           int result=factorial_n/(factorial_r*factorial_nr);
        System.out.println(result);

       */
    int n=10,r=6;
    int factorial_n=1,factorial_r=1,factorial_nr=1;

    for (int i=2;i<=n;i++) {
        factorial_n =factorial_n*i;
        if (i <= r)
            factorial_r =factorial_r*i;

        if (i <= (n - r))
            factorial_nr =factorial_nr * i;
    }
        int ncr=factorial_n/((factorial_r)*(factorial_nr));
        System.out.println(ncr);
    }

}


























