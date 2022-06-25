package class23;

public class BrowserTester {
    public static void main(String[] args) {
        /*Chrome chrome = new Chrome();
        chrome.startBrowser();
        chrome.openUrl("www.google.com");
        chrome.testLoginPage();
        chrome.closeBrowser();

        FireFox firefox = new FireFox();
        firefox.startBrowser();
        firefox.openUrl("www.google.com");
        firefox.testLoginPage();
        firefox.closeBrowser();*/

        WebDriver [] browsers ={new Chrome(),new Safari(),new Edge(),new FireFox()};
        for (WebDriver driver : browsers){
            driver.startBrowser();
            driver.openUrl("www.google.com");
            driver.testLoginPage();
            driver.closeBrowser();
        }

        for (int i =0; i< browsers.length;i++){
            browsers[i].startBrowser();
            browsers[i].openUrl("www.google.com");
            browsers[i].testLoginPage();
            browsers[i].closeBrowser();

        }
    }
}
