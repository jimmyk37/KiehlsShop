package shop.action;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import shop.base.BaseClass;

public class Action extends BaseClass {

	
	Action action;
	
	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	
	public void click(WebDriver driver, WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().build().perform();
		
	}

	
	public boolean isDisplayed(WebElement ele) {
		boolean flag=false;
		try {
			ele.isDisplayed();
			flag=true;
		} catch (Exception e) {
			flag=false;
		} finally {
			if (flag) {System.out.println("Element is Displayed");} 
			else {System.out.println("Element is not Displayed");}			
		}
		return flag;
	}

	
	public boolean type(WebElement ele, String text) {
		boolean flag=false;
		findElement(ele);
		try {
			ele.clear();
			ele.sendKeys(text);
			flag=true;
			
		} finally {
			if (flag) {System.out.println("Success Fully input text");} 
			else {System.out.println("unable to put text");}	
		}
		return false;
	}

	
	public boolean findElement(WebElement ele) {
		boolean flag=false;
		try {
			ele.isDisplayed();
			flag=true;
		} catch (Exception e) {
			flag=false;
		} finally {
			if (flag) {
				System.out.println("Successfully Found Element");
		} else System.out.println("Unable to find Element");
		}
		return flag;
		
	}

	
	public boolean isSelected(WebElement ele) {
		boolean flag=false;
		findElement(ele);
		try {
			ele.isSelected();
			flag=false;
		} finally {
			if (flag) {
				System.out.println("Element is Selected");
		} else System.out.println("Unable to select Element");
		}
		return flag;
	}

	
	public boolean isEnabled(WebDriver ldriver, WebElement ele) {
		boolean flag=false;
		findElement(ele);
		try {
			ele.isEnabled();
			flag=false;
		} finally {
			if (flag) {
				System.out.println("Element is Enabled");
		} else System.out.println("Element is not Enabled");
		}
		return flag;
	}

	
	public boolean selectBySendkeys(String value, WebElement ele) {
		
		return false;
	}

	
	public boolean selectByIndex(WebElement element, int index) {
		Select select=new Select(element);
		findElement(element);
		boolean flag=false;
		try {
			select.selectByIndex(index);
			flag=true;
		} finally {
			if (flag) {
				System.out.println("Selected by Index value");
		} else System.out.println("unable to select");
		}
		
		return flag;
	}

	
	public boolean selectByValue(WebElement element, String value) {
		Select select=new Select(element);
		findElement(element);
		boolean flag=false;
		try {
			select.selectByValue(value);
			flag=true;
		} finally {
			if (flag) {
				System.out.println("Selected by String value");
		} else System.out.println("unable to select");
		}
		return flag; 
	}

	
	public boolean selectByVisibleText(String visibletext, WebElement ele) {
		Select select=new Select(ele);
		findElement(ele);
		boolean flag=false;
		try {
			select.selectByVisibleText(visibletext);
			flag=true;
		} finally {
			if (flag) {
				System.out.println("Selected by visible text");
		} else System.out.println("unable to select");
		}
		return flag; 
	}

	
	public boolean mouseHoverByJavaScript(WebElement locator) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean JSClick(WebDriver driver, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean switchToFrameByIndex(WebDriver driver, int index) {
		boolean flag=false;
		try {new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//iframe")));
		driver.switchTo().frame(index);
			flag=true;
		} finally {
			if (flag) {
				System.out.println("Swithed to fram by index");
		} else System.out.println("unable to swich to frame");
		}
		return flag; 
	}

	
	public boolean switchToFrameByIdvalue(WebDriver driver, String idValue) {
		boolean flag=false;
		try {new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//iframe")));
		driver.switchTo().frame(idValue);
			flag=true;
		} finally {
			if (flag) {
				System.out.println("Swithed to fram by id");
		} else System.out.println("unable to swich to frame");
		}
		return flag;
	}

	
	public boolean switchToFrameByName(WebDriver driver, WebElement ele) {
		boolean flag=false;
		try {new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//iframe")));
		driver.switchTo().frame(ele);
			flag=true;
		} finally {
			if (flag) {
				System.out.println("Swithed to fram by ele");
		} else System.out.println("unable to swich to frame");
		}
		return flag;
	}

	
	public boolean switchToDefaultFrame(WebDriver driver) {
		boolean flag=false;
		try {new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//iframe")));
		driver.switchTo().defaultContent();
			flag=true;
		} finally {
			if (flag) {
				System.out.println("Swithed to default frame");
		} else System.out.println("unable to swich to default frame");
		}
		return flag;
	}

	
	public void mouseOver(WebDriver driver, WebElement element) {
		new Actions(driver).moveToElement(element).build().perform();
		
	}

	
	public boolean moveToElement(WebDriver driver, WebElement ele) {
		
		return false;
	}

	
	public boolean mouseover(WebDriver driver, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean draggable(WebDriver driver, WebElement source, int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean draganddrop(WebDriver driver, WebElement source, WebElement target) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean slider(WebDriver driver, WebElement ele, int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean rightclick(WebDriver driver, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean switchWindowByTitle(WebDriver driver, String windowTitle, int count) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean switchToNewWindow(WebDriver driver) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean switchToOldWindow(WebDriver driver) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public int getColumncount(WebElement row) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int getRowCount(WebElement table) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public boolean Alert(WebDriver driver) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean launchUrl(WebDriver driver, String url) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean isAlertPresent(WebDriver driver) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public String getCurrentURL(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getTitle(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean click1(WebElement locator, String locatorName) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void fluentWait(WebDriver driver, WebElement element, int timeOut) {
		// TODO Auto-generated method stub
		
	}

	
	public void implicitWait(WebDriver driver, int timeOut) {
		// TODO Auto-generated method stub
		
	}

	
	public void explicitWait(WebDriver driver, WebElement element, int timeOut) {
		// TODO Auto-generated method stub
		
	}

	
	public void pageLoadTimeOut(WebDriver driver, int timeOut) {
		// TODO Auto-generated method stub
		
	}

	
	public String screenShot(WebDriver driver, String filename) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getCurrentTime() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
