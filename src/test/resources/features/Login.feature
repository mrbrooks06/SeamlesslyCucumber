Feature: Login Functionality
Background:
  Given User should go to Seamlessly login page


  @SEAMLES-323
  Scenario: Verify that user can login with valid credentials -BI
  Scenario:User can login with valid credentials

    When  User should enter "Employee1" user name and "Employee123" password than click login button
    Then  User should be able to login



  @SEAMLES-324
  Scenario: Verify that user can not login with any invalid credentials-BI
  Scenario:User can not login with any invalid credentials

    When   User should enter "wrongUser" user name and "WrongPassword" password than click login button
    Then  User should not be able to login and see warning message




  @SEAMLES-325
  Scenario: Verify that User can see the password in a form of dots by default-BI
  Scenario:User can see the password in a form of dots by default

    When  User should enter "password" password
    Then User can see the password in a form of dots by default

  @SEAMLES-326
  Scenario: Verify That user can see the password explicitly if needed-BI
  Scenario:User can see the password explicitly if needed

    When  User should enter "password" password
    And   User should click eye icon
    Then User can see the password explicitly if needed

  @SEAMLES-327
  Scenario: Verify that user can see an option link like "forgot password" on the login page to be able to reset the password-BI
  Scenario:User can see an option link like "forgot password" on the login page to be able to reset the password

    When  User should click Forgot password icon
    And   user should enter e-mail address than click reset password icon
    Then  User should be able to see reset email sended message


  @SEAMLES-328
  Scenario: Verify that user can see valid placeholders on Username and Password fields-BI
  Scenario:User can see valid placeholders on Username and Password field

    Then  User can see valid placeholders on Username and Password fields






