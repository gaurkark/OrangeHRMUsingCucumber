package commonfunction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonFunction {
	static WebDriver driver;
	
	public static void crossBrowser(String url) {
		switch("1") {
		case "1":driver=new ChromeDriver();
		       driver.manage().window().maximize();
		       driver.get(url);
		case "2":driver=new FirefoxDriver();
		       driver.manage().window().maximize();
		       driver.get(url);
		case "3":driver=new EdgeDriver();
		       driver.manage().window().maximize();
		       driver.get(url);}}
	public static Properties readDataFromPropertiesFile() throws IOException {
		File file=new File("C:\\Users\\HP\\eclipse-workspace\\OrangeHRMProject\\properties\\data.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties pro=new Properties();
		pro.load(fis);
		return pro;}
	public static void screenShot(WebDriver driver,String fileName) {
		TakesScreenshot sc=(TakesScreenshot)driver;
		File file=sc.getScreenshotAs(OutputType.FILE);
		File file1=new File("C:\\Users\\HP\\eclipse-workspace\\OrangeHRMProject\\screenshot\\"+fileName+".png");}
	public static void scrollDown(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<=20;i++) {
			js.executeScript("window.scrollBy(0,50)");}}
		public static void scrollUp(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<=20;i++) {
			js.executeScript("window.scrollBy(0,-50)");}}
		
}	
	
	


