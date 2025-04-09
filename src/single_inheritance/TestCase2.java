package single_inheritance;

public class  TestCase2 extends CommonToAll{

    void runningTC2(){
        startBrowser();
        System.out.println("running TC2");
        readDataBaseFile();
        readExcelFile();
        closeBrowser();
    }
}
