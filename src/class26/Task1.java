package class26;

public class Task1 {
    /*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
    public static void main(String[] args) {

      WebDriver []driver ={new ChromeDriver(),new FireFoxDriver()};
      for (WebDriver drivers : driver){
          drivers.openBrowser();
          drivers.maximizeWindow();
          drivers.findElement();
          drivers.closeBrowser();
      }

    }

}
interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open the Chrome browser");
    }

    @Override
    public void closeBrowser() {

        System.out.println("Close Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the window on Google Chrome");
    }

    @Override
    public void findElement() {
        System.out.println("Find elements on Google Chrome");
    }
}
class FireFoxDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Open the FireFox browser");
    }

    @Override
    public void closeBrowser() {

        System.out.println("Close FireFox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the window on  FireFox");
    }

    @Override
    public void findElement() {
        System.out.println("Find elements on FireFox");
    }
}
