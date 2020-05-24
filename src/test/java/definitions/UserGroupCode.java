package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class UserGroupCode {

    @And("I type first name {string}")
    public void iTypeFirstName(String Fname) {
        getDriver().findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys(Fname);

    }


    @And("I type last name {string}")
    public void iTypeLastName(String Lname) {
        getDriver().findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys(Lname);
    }

    @And("I type email {string}")
    public void iTypeEmail(String email) {
        getDriver().findElement(By.xpath("//*[@placeholder='Email']")).sendKeys(email);
    }

    @And("I type group code {string}")
    public void iTypeGroupCode(String group) {
        getDriver().findElement(By.xpath("//*[@placeholder='Group Code']")).sendKeys(group);
    }

    @And("I type password {string}")
    public void iTypePassword(String pass) {
        getDriver().findElement(By.xpath("//*[@placeholder='Password']")).sendKeys(pass);
    }

    @And("I type confirm password {string}")
    public void iTypeConfirmPassword(String confirmpass) {
        getDriver().findElement(By.xpath("//*[@placeholder='Confirm Password']")).sendKeys(confirmpass);
    }

    @Then("I click Register me button.")
    public void iClickRegisterMeButton() {
        getDriver().findElement(By.xpath("//span[contains(text(),'Register Me')]")).click();
    }

    @Then("{string} message appears")
    public void messageAppears(String message) throws Throwable {
        Thread.sleep(2000);
        assertThat(getDriver().findElement(By.xpath("//*[contains(text(),'" + message + "')]")).isDisplayed()).isTrue();
    }


}
