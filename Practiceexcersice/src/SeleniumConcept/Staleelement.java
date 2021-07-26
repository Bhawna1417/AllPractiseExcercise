package SeleniumConcept;


import webdrive_architecture.webdriver;

public class Staleelement {
private WebDriver driver;
	
	
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		System.out.println("In test 1");
		driver.get("http://google.com");
		String expectedPageTitle = "Google";
		Assert.assertTrue(driver.getTitle().contains(expectedPageTitle), "Test Failed");
	}
}
