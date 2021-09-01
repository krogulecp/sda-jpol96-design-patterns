package info.krogulec.sda.designpatterns.singleresponsibility;

public class Person {
    private final String name;
    private final String id;
    private final LogStorageSystem logStorageSystem;

    public Person(String name, String id, LogStorageSystem logStorageSystem) {
        this.name = name;
        this.id = id;
        this.logStorageSystem = logStorageSystem;
    }

    void givePayment(){
        //... wypłacamy wypłatę
        logStorageSystem.storeLogs("wypłacono wypłatę dla " + id);
    }
}
