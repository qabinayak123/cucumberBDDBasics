# new feature
# Tags: optional

Feature: Hooks in cucumber

  Scenario: Add new Customer
    Given User is on add Customer page
    When  User fills the customer details
    Then  Customer is added

  Scenario: Edit Customer
    Given User is on edit Customer page
    When  User edits contact details
    Then  contact details updated

  Scenario: Delete Customer
    Given User is on delete Customer page
    When  User delete customer
    Then  Customer is deleted