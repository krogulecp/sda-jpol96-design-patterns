package info.krogulec.sda.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        // lazy
        final LazySingleton instance1 = LazySingleton.getInstance();
        final LazySingleton instance2 = LazySingleton.getInstance();

        System.out.println(instance1.equals(instance2));

        //eager
        final EagerSingleton eagerInstance1 = EagerSingleton.getInstance();
        final EagerSingleton eagerInstance2 = EagerSingleton.getInstance();

        System.out.println(eagerInstance1.equals(eagerInstance2));
    }
}
