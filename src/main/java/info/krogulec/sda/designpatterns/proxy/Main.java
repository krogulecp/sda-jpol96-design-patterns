package info.krogulec.sda.designpatterns.proxy;

public class Main {
    public static void main(String[] args) {
        ImportantDataService importantDataService = new ImportantDataServiceProxy(
                new ImportantDataServiceImpl(),
                new SecurityService()
        );
        importantDataService.getImportantData();
    }
}
