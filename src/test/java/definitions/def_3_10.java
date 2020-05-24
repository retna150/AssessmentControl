package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import static org.assertj.core.api.Assertions.assertThat;

import static support.TestContext.getDriver;

public class def_3_10 {
    @Given("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String page) throws Throwable {
        if (page.equalsIgnoreCase("login")) {
            getDriver().get("http://ask-stage.portnov.com/#/login");
        } else if (page.equalsIgnoreCase("registration")) {
            getDriver().get("http://ask-stage.portnov.com/#/registration");
        } else {
            throw new RuntimeException("Not supported " + page);
        }
    }

    @When("^I type email \"([^\"]*)\" on \"([^\"]*)\" page$")
    public void iTypeEmailOnPage(String email, String page) throws Throwable {
        if (page.equalsIgnoreCase("login")) {
            getDriver().findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys(email);
        } else if (page.equalsIgnoreCase("registration")) {
            getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
        } else {
            throw new RuntimeException("Not supported " + page);
        }
    }

    @And("^I type password \"([^\"]*)\" on \"([^\"]*)\" page$")
    public void iTypePasswordOnPage(String pass, String page) throws Throwable {
        if (page.equalsIgnoreCase("login")) {
            getDriver().findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys(pass);
        } else if (page.equalsIgnoreCase("registration")) {
            getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
        } else {
            throw new RuntimeException("Not supported " + page);
        }
    }

    @And("^I click Sign in button$")
    public void iClickSignInButton() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();
        Thread.sleep(1000);
    }

    @And("I click on {string} on left menu")
    public void iClickOnOnLeftMenu(String page) throws Throwable {
        if (page.equalsIgnoreCase("Quizzes")) {
            getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();

        } else if (page.equalsIgnoreCase("Assignments")) {
            Thread.sleep(2000);

            getDriver().findElement(By.xpath("//h5[contains(text(),'Assignments')]")).click();
            Thread.sleep(2000);
            Thread.sleep(2000);
        }
    }


    @And("I click create new quiz button")
    public void iClickCreateNewQuizButton() throws Throwable {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
    }

    @And("I type title of the quiz {string}")
    public void iTypeTitleOfTheQuiz(String arg0) throws Throwable {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys(arg0);

        Thread.sleep(2000);
    }


    @And("I click on Add question button")
    public void iClickOnAddQuestionButton() throws Throwable {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted']//span[1]")).click();
    }

    @And("I select textual type of Question")
    public void iSelectTextualTypeOfQuestion() throws Throwable {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//div[contains(text(),'Textual')]")).click();

    }

    @And("I type text of question {string}")
    public void iTypeTextOfQuestion(String arg1) throws Throwable {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//textarea[@id='mat-input-3']")).sendKeys(arg1);
    }

    @And("I save the quiz")
    public void iSaveTheQuiz() throws Throwable {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//div[@class='form-controls-container ng-star-inserted']//button[2]")).click();
    }


    @And("click on Create New Assignment button")
    public void clickOnCreateNewAssignmentButton() throws Throwable {

        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Assignment')]")).click();
    }

    @And("I select quiz {string} as new assignment")
    public void iSelectQuizAsNewAssignment(String arg0) throws Throwable {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//mat-select[@placeholder='Select Quiz To Assign']")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Retna Selenium quiz')]")).click();
    }

    @And("I select student {string}")
    public void iSelectStudent(String arg0) throws Throwable {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//div[contains(.,'Roy Tom')]")).click();
    }

    @And("I click Give assignment button")
    public void iClickGiveAssignmentButton() throws Throwable {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Give Assignment')]")).click();
    }


    @And("I click Log Out")
    public void iClickLogOut() throws Throwable {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
    }

    @And("I confirm Log Out")
    public void iConfirmLogOut() throws Throwable {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//button[@class='mat-button mat-warn']")).click();
        Thread.sleep(2000);
    }

    @And("I click on My Assignments")
    public void iClickOnMyAssignments() throws Throwable {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'My Assignments')]")).click();
    }

    @Then("Student Assignment page should have quiz {string}")
    public void studentAssignmentPageShouldHaveQuiz(String arg0) throws Throwable {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//td[contains(text(),'Retna Selenium quiz')]")).isDisplayed();

    }


    @And("select quiz {string} from Assignments and delete")
    public void selectQuizFromAssignmentsAndDelete(String arg0) throws Throwable {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Retna Selenium quiz')]")).isDisplayed();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Quiz: Retna Selenium quiz')]")).click();
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Quiz: Retna Selenium quiz')]/..//*[contains(text(),'more_vert')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Delete Assignment')]")).click();


    }

    @And("I confirm delete")
    public void iConfirmDelete() throws Throwable {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//button[@class='mat-button mat-warn']")).click();
        Thread.sleep(2000);
    }

    @Then("I verify if quiz {string} is deleted from the Assignments page")
    public void iVerifyIfQuizIsDeletedFromTheAssignmentsPage(String arg0) throws Throwable {
        Thread.sleep(2000);

        {
            if (getDriver().getPageSource().contains("Retna Selenium quiz")) {
                System.out.println("Quiz is present");
            } else {
                System.out.println("Quiz is not present");
            }
        }
    }


    @And("I select Quiz {string}")
    public void iSelectQuiz(String arg0)throws Throwable {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Quiz: Retna Selenium quiz')]")).click();
        Thread.sleep(2000);
    }

    @And("I delete Quiz")
    public void iDeleteQuiz() throws Throwable{
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Retna Selenium quiz')]/../../..//span[contains(text(),'Delete')]")).click();
    }

    @Then("I verify if quiz {string} is deleted from the Quizzes page")
    public void iVerifyIfQuizIsDeletedFromTheQuizzesPage(String arg0) {
        if (getDriver().getPageSource().contains("Retna Selenium quiz"))
        {
            System.out.println("Quiz is present");
        }
        else
        {
            System.out.println("Quiz is not present");
        }
    }
}









