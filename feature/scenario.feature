 Feature: check login page
 
  Scenario: open OrangeHRM on Diffrent browser
    Given launch orangeHRM on diffrent Browser
   
  Scenario: open OrangeHRM on chrome browser and ScrollUp and Scroll Down
  Given lauch orange HRM
  Then scroll up and Scroll down orangeHRM
  Scenario: check user can logi successfully with valid data
  Given lauch orange HRM
  Then Enter username and password
  And then click on login button and validate
  Scenario: check user can login with invalid data 
  Given lauch orange HRM
  Then enter invalid username and password
  And Then click on login button
  Scenario: check how many links on login page and it is working
  Given lauch orange HRM
  Then check how many links on login page and it is working
  Scenario: check before enter username and password button is working
  Given lauch orange HRM
  Then click on login button and validate
  @positive
  Scenario: check user can reset password
  Given lauch orange HRM
  Then click on forgot password
  Then enter user name
  And then click on reset password button and validate