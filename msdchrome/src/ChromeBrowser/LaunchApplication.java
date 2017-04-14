package ChromeBrowser;

public class LaunchApplication {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

}
