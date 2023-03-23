public class pass_by_value {
    public static void increment(int n){
        n++;
        System.out.println("after increment " + n);
    }

    public static void main(String[] args) {
        int n=10;
        increment(n);
        System.out.println( "before increment " +n);
    }
}
