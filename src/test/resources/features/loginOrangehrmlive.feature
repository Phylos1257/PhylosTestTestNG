 @remote
Feature: test for orangehrmlive 
  I want to use this template for my feature file

  @remote @testNG1 @testNG
  Scenario: User valid login into web HRM
    Given User open browser and url
    When User enter valid username
    And User enter valid password
    And User click button login
    Then User go to page dashboard
    
      @remote
  Scenario: User valid login into web HRM2
    Given User open browser and url
    When User enter valid username
    And User enter valid password
    And User click button login
    Then User go to page dashboard
    
      #@remote
  #Scenario: User valid login into web HRM3
    #Given User open browser and url
    #When User enter valid username
    #And User enter valid password
    #And User click button login
    #Then User go to page dashboard
