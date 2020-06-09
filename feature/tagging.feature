# new feature
# Tags: optional

Feature: Tags in cucmber
@SanityTest
  Scenario: Verify Login
    Given This is a valid login test

  @SanityTest @EndToEndTest
  Scenario: Verify Logout
    Given This is a logout Test

  @RegressionTest
  Scenario: Verify search
    Given This is a serach test

  @RegressionTest @EndToEndTest
  Scenario: Verify Advance search
    Given This is advanced search test

  @EndToEndTest
  Scenario: Verify prepaid recharge
    Given This is prepaid recharge test

  @EndToEndTest
  Scenario: Verify postpaid recharge
    Given This is postpaid recharge test