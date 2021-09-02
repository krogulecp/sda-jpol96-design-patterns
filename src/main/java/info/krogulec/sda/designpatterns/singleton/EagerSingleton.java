package info.krogulec.sda.designpatterns.singleton;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
}
