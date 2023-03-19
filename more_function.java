import java.util.*;
public class more_function {

    public static  int  sum(int a,int b){
        int ans=a+b;
        return ans;
    }
    public static  void  printevenno(){
        for (int i=2;i<100;i+=2){
            System.out.println(i);

        }
    }
    public  static double sum(int a,int b,double c){
        double ans=a+b+c;
        return ans;
    }
    public static void  printevenno_between_two_no(int start,int end){
        if (start %2 !=0){
            start++;
        for (int i=start;i<end;i+=2){
            System.out.println(i);
        }
        }
    }

    public static void main(String[] args) {
      printevenno_between_two_no(1,10);
      System.out.println();
        System.out.println( sum(45,45));
        System.out.println();
        System.out.println(sum(15,15,30.5));
        System.out.println();
        printevenno();
    }
}
