package info.krogulec.sda.designpatterns.proxy;

public class ImportantDataServiceProxy implements ImportantDataService{
    private final ImportantDataService importantDataService;
    private final SecurityService securityService;

    public ImportantDataServiceProxy(ImportantDataService importantDataService, SecurityService securityService) {
        this.importantDataService = importantDataService;
        this.securityService = securityService;
    }

    @Override
    public void getImportantData() {
        securityService.checkSecurity();
        importantDataService.getImportantData();
    }
}
