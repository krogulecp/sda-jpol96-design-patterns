package info.krogulec.sda.designpatterns.proxy;

public class ImportantDataServiceImpl implements ImportantDataService {

    @Override
    public void getImportantData() {
        System.out.println("getting some important data");
    }
}
