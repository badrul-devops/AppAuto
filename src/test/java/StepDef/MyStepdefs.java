package StepDef;
import Test.TestApp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class MyStepdefs {

    TestApp testapp;

    @Given("Check that Home button is available in Top")
    public void checkThatHomeButtonIsAvailableInTop() throws InterruptedException {
        Assert.assertTrue(testapp.home().isDisplayed());
        Thread.sleep(1000);
    }

    @When("Click on Home button")
    public void clickOnHomeButton() throws InterruptedException {
        testapp.home().click();
        Thread.sleep(1000);
    }

    @Then("Check that a navigation window is display")
    public void checkThatANavigationWindowIsDisplay() throws InterruptedException {

        Assert.assertTrue(testapp.Navbar().isDisplayed());

        Thread.sleep(1000);

    }

    @And("Check that Home icon is display")
    public void checkThatHomeIconIsDisplay() throws InterruptedException {

        Assert.assertTrue(testapp.homeIcon().isDisplayed());

        Thread.sleep(1000);


    }

    @And("Check that Home Word is display beside Home icon")
    public void checkThatHomeWordIsDisplayBesideHomeIcon() throws InterruptedException {
        Assert.assertTrue(testapp.Hometaxt().isDisplayed());
        Thread.sleep(1000);

    }

    @When("Click on Home Button from the Navigation bar")
    public void clickOnHomeButtonFromTheNavigationBar() throws InterruptedException {
        testapp.Hometaxt().click();
        Thread.sleep(1000);

    }

    @Then("Check the navigation bar is close")
    public void checkTheNavigationBarIsClose() throws InterruptedException {
        Assert.assertTrue(testapp.home().isDisplayed());
        Thread.sleep(1000);


    }

    @And("Check that Nothing is Changed")
    public void checkThatNothingIsChanged() throws InterruptedException {
        Assert.assertTrue(testapp.home().isDisplayed());
        Thread.sleep(1000);
    }
}
