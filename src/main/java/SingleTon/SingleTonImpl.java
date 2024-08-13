package SingleTon;

public class SingleTonImpl {
    public static void main(String[] args) {
        System.out.println("SingleTon Implementation");
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton.val + " " + singleton2.val);
    }
}
