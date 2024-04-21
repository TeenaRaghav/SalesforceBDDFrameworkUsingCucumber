Feature: Create an account
Background: Launch the application and login
Given User launch the application in "Edge"
Given User is on "LoginPage"
Then user waits for Element "Username"
Then User Enter into text box "Username" "teena@raghav.com"
Then User Enter into text box "Password" "pritishtina@1"
Then Click on the button "Login"
Then User is on "HomePage"

Scenario: TestCase11 Edit Account 
Then Click on the button "AccountsTab"
Given User is on "AccountsPage"
Then Click on the button "NewButton"
Then User Enter into text box "AccountName" "TISCO & CO"
Then User selects by value "Type" "Technology Partner"
Then User selects by value "Priority" "High"
Then Click on the button "Save"


Scenario: TestCase12 Create New View link
Then Click on the button "AccountsTab"
Given User is on "AccountsPage"
Then Click on the button "NewViewLink"
Then User Enter into text box "ViewName" "Hi Value Costumersss"
Then User Enter into text box "ViewUniqueName" "dbshebkdrten"
Then Click on the button "SaveButtonNewViewlink"

Scenario: TestCase13 Edit Account
Then Click on the button "AccountsTab"
Given User is on "AccountsPage"
Then User selects by value "ViewDropDown" "00Bak000004s8sr"
Then Click on the button "Edit"
Then User Enter into text box "ViewName" "High Value Customers12"
When User selects by visible Text "Field" "Account Name"
When User selects by visible Text "Operator" "contains"
Then User Enter into text box "Value" "a"
Then User scrolls down
Then User selects by value "AvailableFields" "ACCOUNT.LAST_ACTIVITY"
Then Click on the button "Add"
Then Click on the button "SaveButtonInEditViewPage"

Scenario: TestCase14 Merge Accounts
Then Click on the button "AccountsTab"
Given User is on "AccountsPage"
Then User Click On the Link "MergeAccount"
Then User Enter into text box "SearchAccount" "TSN"
Then Click on the button "FindAccount"
Then User Checked the checkbox "Checkbox1"
Then User Checked the checkbox "Checkbox2"
Then Click on the button "MergeAccntNext"
Then Click on the button "Merge"
Then User Accept the alert


Scenario: TestCase15 create account report
Then Click on the button "AccountsTab"
Given User is on "AccountsPage"
Then User Click On the Link "LastActivityLink"
Then Click on the button "DateFieldDropdown"
Then Click on the button "CreatedDateField"
Then Click on the button "DateInFromField"
Then Click on the button "TodaysButtonInFromField"
Then Click on the button "SaveBtnInCreateReportpage"
Then User Enter into text box "ReportNameTextBox" "highPriorityreports"
Then Click on the button "ReportUniqueNameTextBox"
Then Click on the button "SaveAndRun"
Then User waits to load page









