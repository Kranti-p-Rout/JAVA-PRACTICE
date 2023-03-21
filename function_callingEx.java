public class function_callingEx {
    public static void  b() {
        System.out.println("Inside B");
    }
    public static void  a() {
        b();
        System.out.println("Inside A");
    }

    public static void main(String[] args) {
        a();
        System.out.println("Inside Main");
    }

}
