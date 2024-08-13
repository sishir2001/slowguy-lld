package SingleTon;
import java.util.*;
public class Singleton {
    Integer val;
    private static volatile Singleton instance;
    private Singleton() {
        val = 1;
    }
    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if(instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }

}
