package net.Seamlessly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.Seamlessly.pages.LoginPage;
import net.Seamlessly.utulities.BrowserUtils;
import net.Seamlessly.utulities.ConfigurationReader;
import net.Seamlessly.utulities.Driver;
import org.junit.Assert;

public class LoginStepDef {
    @Given ("User should go to Seamlessly login page")
    public void user_should_go_to_Seamlessly_login_page() {
        Driver.get ().get ( ConfigurationReader.get ( "url" ) );
    }

    @When("User should enter {string} and {string} than click login button")
    public void user_should_enter_and_than_click_login_button(String username, String password) {



    }

    @Then("User should be able to login")
    public void user_should_be_able_to_login() {

        BrowserUtils.waitFor ( 5 );

        Assert.assertTrue ( Driver.get ().getCurrentUrl ().equals ( "http://qa.seamlessly.net/index.php/apps/files/?dir=/&fileid=1082" ) );

    }

    @When("User should enter {string} user name and {string} password than click login button")
    public void user_should_enter_user_name_and_password_than_click_login_button(String username, String password) {
        new LoginPage ().userName.sendKeys (username  );

        new LoginPage ().password.sendKeys ( password );

        new LoginPage ().loginButton.click ();
    }

    @Then("User should not be able to login and see warning message")
    public void user_should_not_be_able_to_login_and_see_warning_message() {
        BrowserUtils.waitFor ( 3 );

        Assert.assertTrue ( new LoginPage ().wrongWarningMessage.isDisplayed () );


    }

    @When("User should enter {string} password")
    public void user_should_enter_password(String password) {
        // Write code here that turns the phrase above into concrete actions
        new LoginPage ().password.sendKeys ( password );
    }

    @Then("User can see the password in a form of dots by default")
    public void user_can_see_the_password_in_a_form_of_dots_by_default() {
       Assert.assertEquals ( "password",new LoginPage ().password.getAttribute ( "type" ) );
    }

    @When("User should click eye icon")
    public void user_should_click_eye_icon() {
        new LoginPage ().eyeIcon.click ();
        BrowserUtils.waitFor ( 3 );
    }

    @Then("User can see the password explicitly if needed")
    public void user_can_see_the_password_explicitly_if_needed() {


        Assert.assertEquals ( "text",new LoginPage ().password.getAttribute ( "type" ) );
    }

    @When("User should click Forgot password icon")
    public void user_should_click_Forgot_password_icon() {
       new LoginPage ().forgotPasswordIcon.click ();
        BrowserUtils.waitFor ( 3 );


    }

    @When("user should enter e-mail address than click reset password icon")
    public void user_should_enter_e_mail_address_than_click_reset_password_icon() {

       new LoginPage ().forgotUserNameBox.sendKeys ( ConfigurationReader.get ( "username" ) );

        new LoginPage ().resetPasswordIcon.click ();

        BrowserUtils.waitFor ( 3 );

    }

    @Then("User should be able to see reset email sended message")
    public void user_should_be_able_to_see_reset_email_sended_message() {
       Assert.assertTrue ( new LoginPage ().resetMessage.isDisplayed () );
    }

    @Then("User can see valid placeholders on Username and Password fields")
    public void user_can_see_valid_placeholders_on_Username_and_Password_fields() {
       Assert.assertEquals ( "Username or email",new LoginPage ().userName.getAttribute ( "placeholder" ) );

       Assert.assertEquals ( "Password",new LoginPage ().password.getAttribute ( "placeholder" ) );
    }



}
