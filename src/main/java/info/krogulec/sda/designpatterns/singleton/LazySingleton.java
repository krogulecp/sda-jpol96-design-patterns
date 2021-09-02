package info.krogulec.sda.designpatterns.singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){}

    // double-checked singleton
    public static LazySingleton getInstance(){
            if (instance == null){
                synchronized (LazySingleton.class){
                    if (instance == null){
                        instance = new LazySingleton();
                    }
                }
            }
            return instance;
    }
}
