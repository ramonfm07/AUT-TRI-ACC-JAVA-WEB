package tricentis.utils;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tricentis.utils.Utils;
import tricentis.setup.Hooks;



public class Utils {

	private static WebDriver driver;

	private static WebDriver getWebDriver() {
		return driver;
	}

	private static WebDriverWait wait;
	private static int timeOut = 120;

	public static void takeScreenshot(String fileName) {
		File scrFile = ((TakesScreenshot) Hooks.getDriver()).getScreenshotAs(OutputType.FILE);
		Date data = new Date();
		try {
			FileUtils.copyFile(scrFile, new File("\\src\\test\\resources\\evidências\\" + fileName + Utils.dataHoraParaArquivo() + ".jpeg"),
					true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String dataHoraParaArquivo() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("yyyyMMddhhmmss").format(ts);

	}

	public static void aguardar_elemento(int timeout, WebElement elemento) {

		WebDriverWait aguardar = new WebDriverWait(Hooks.getDriver(), timeout);
		aguardar.until(ExpectedConditions.visibilityOf(elemento));
	}

	public static void waitElementClickable(WebElement element) {

		wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void clicarElemento(WebElement element) {
		waitElementClickable(element);
		element.click();
	}

	public static boolean elemento_existe(WebElement elemento, int timeout) {

		try {
			aguardar_elemento(timeout, elemento);

			return true;

		} catch (Exception e) {
			return false;
		}
	}

}

