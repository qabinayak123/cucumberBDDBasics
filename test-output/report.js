$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:feature/hooks.feature");
formatter.feature({
  "name": "Hooks in cucumber",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add new Customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on add Customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.hooksStepDefinition.user_is_on_add_Customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fills the customer details",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.hooksStepDefinition.user_fills_the_customer_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer is added",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.hooksStepDefinition.customer_is_added()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Edit Customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on edit Customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.hooksStepDefinition.user_is_on_edit_Customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User edits contact details",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.hooksStepDefinition.user_edits_contact_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "contact details updated",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.hooksStepDefinition.contact_details_updated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete Customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on delete Customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.hooksStepDefinition.user_is_on_delete_Customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User delete customer",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.hooksStepDefinition.user_delete_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer is deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.hooksStepDefinition.customer_is_deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});