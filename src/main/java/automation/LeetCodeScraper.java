package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LeetCodeScraper {
    public static void main(String[] args) {

        String username = System.getenv("GITHUB_USR");
        String password = System.getenv("GITHUB_PW");


        WebDriver driver = new EdgeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://leetcode.com/");
        //SIGNING IN
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"landing-page-app\"]/div/div[1]/div[3]/div[1]/div/div/div[2]/div/a[5]/span")));

        loginButton.click();
        WebElement githubLogin = wait.until(ExpectedConditions.elementToBeClickable(new By.ByCssSelector("#app > div > div.sign-in-wrapper__2SAX > div > div.placeholder-bottom__2SYS > div > div > div > div.container__1lsb > div > a:nth-child(2)")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("initial-loading")));

        githubLogin.click();
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"base_content\"]/form/button")));
        submitButton.click();

        WebElement usrName = wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login_field\"]"))));
        usrName.sendKeys(username);

        WebElement pw = wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]"))));
        pw.sendKeys(password);

        WebElement signIn = wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login\"]/div[3]/form/div/input[13]"))));

        signIn.click();

        WebElement passKey = wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login\"]/div[3]/div[2]/form/webauthn-get/button"))));

        passKey.click();

        // AFTER SIGN IN

        WebElement profilePic = wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"headlessui-menu-button-5\"]"))));
        profilePic.click();

        WebElement submission = wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"web-user-menu\"]/div/div[2]/a[3]"))));
        submission.click();

        //THE LOGIC FOR UPDATING DATABASE OF SOLUTIONS
        WebElement table = wait.until((ExpectedConditions.elementToBeClickable(By.tagName("table"))));

        List<WebElement> rows = table.findElements(By.tagName("tr"));
    }
}
