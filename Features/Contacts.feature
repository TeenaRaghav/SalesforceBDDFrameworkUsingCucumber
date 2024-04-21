Feature: Leads scenarios
Background: Launch the application and login
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then user waits for Element "Username"
Then User Enter into text box "Username" "teena@raghav.com"
Then User Enter into text box "Password" "pritishtina@1"
Then Click on the button "Login"
Then User is on "HomePage"


Scenario: Testcase26 Create new contacts
Then User waits to load page
Then Click on the button "ContactsTab"
Then User is on "ContactsPage"
Then Click on the button "New"
Then User Enter into text box "LastName" "Adams"
And User gets the parent window handle
Then Click on the button "LookUpIcon"
Then User switch to child window
When User switches to the frame "LookUpIconFrame"
Then Click on the button "AccountNameFromLookUp"
Then User switch to parent window
Then Click on the button "Save1"


Scenario: Testcase27 Create new view
Then Click on the button "ContactsTab"
Then User is on "ContactsPage"
Then User Click On the Link "NewView"
Then User Enter into text box "NewViewName" "Valued Costumer"
Then user waits for Element "NewViewUniqueName"
Then User Enter into text box "NewViewUniqueName" "High_valued_customerssssss"
Then Click on the button "Save"


Scenario: Testcase28 Check recently created contact
Then Click on the button "ContactsTab"
Then User is on "ContactsPage"
Then User selects by value "FilterView" "2"


Scenario: Testcase29 Select view in contacts
Then Click on the button "ContactsTab"
Then User is on "ContactsPage"
When User selects by visible Text "ViewDropdownInContacts" "My Contacts"


Scenario: Testcase30 View recent contacts
Then Click on the button "ContactsTab"
Then User is on "ContactsPage"
Then Click on the button "RecentContacts"


Scenario: Testcase31 Create new view in contacts
Then Click on the button "ContactsTab"
Then User is on "ContactsPage"
Then Click on the button "NewView"
Then User Enter into text box "NewViewUniqueName" "EFGH"
Then Click on the button "Save"

@test
Scenario: Testcase32 Create new contacts
Then Click on the button "ContactsTab"
Then User is on "ContactsPage"
Then Click on the button "NewView"
Then User Enter into text box "NewViewName" "DEFG"
Then User Enter into text box "NewViewUniqueName" "EFGH"
Then Click on the button "CancelInContacts"