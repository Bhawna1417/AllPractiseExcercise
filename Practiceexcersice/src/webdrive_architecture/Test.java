package webdrive_architecture;

public class Test {

	public static void main(String[] args) {
		webdriver driver=new chromedriver();  ///Need to read top casting here for this line
		driver.get("https://google.com");
		driver.findelement("Bhawna");
		driver.close();
		driver.quit();
		
		// TODO Auto-generated method stub

	}

}
