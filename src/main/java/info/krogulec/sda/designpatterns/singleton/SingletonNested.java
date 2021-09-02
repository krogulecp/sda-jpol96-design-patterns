package info.krogulec.sda.designpatterns.singleton;

public class SingletonNested {
    private SingletonNested(){}

    public static SingletonNested getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final SingletonNested instance = new SingletonNested();
    }
}
