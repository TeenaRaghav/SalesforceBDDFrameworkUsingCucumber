Feature: Opportunities scenarios
Background: Launch the application and login
Given User launch the application in "Edge"
Given User is on "LoginPage"
Then user waits for Element "Username"
Then User Enter into text box "Username" "teena@raghav.com"
Then User Enter into text box "Password" "pritishtina@1"
Then Click on the button "Login"
Then User is on "HomePage"


Scenario: TestCase16 Opportunity dropdown 
Then Click on the button "OpportunitiesTab"
Then User is on "OpportunityPage"
Then user waits for Element "OpportunityTabdropdown"
Then Click on the button "OpportunityTabdropdown"
Then User waits to load page


Scenario: TestCase17 Create new Opportunity  
Then Click on the button "OpportunitiesTab"
Then User is on "OpportunityPage"
Then Click on the button "New"
Then User Enter into text box "OpportunityName" "New_Website_Project"
Then User Enter into text box "AccountName" "MSN & CO"
Then Click on the button "CloseDate"
Then Click on the button "CloseDateselectBtn"
Then User selects by value "Stage" "Qualification"
Then Click on the button "Probability"
Then User selects by value "LeadSource" "Web"
And User gets the parent window handle
Then Click on the button "PrimaryCampaignSource"
Then User switch to child window
When User switches to the frame "PrimaryCampaignSourceFrame"
Then Click on the button "PrimaryCampaignlink"
Then User switch to parent window
Then Click on the button "Save"


Scenario: TestCase18 Opportunity pipeline link  
Then Click on the button "OpportunitiesTab"
Then User is on "OpportunityPage"
Then Click on the button "OpportunityPipelineLink"
Then user validate page is displayed "OpportunityPageHeading" "Opportunity Pipeline"


Scenario: TestCase19 Stuck Opportunity link  
Then Click on the button "OpportunitiesTab"
Then User is on "OpportunityPage"
Then Click on the button "StuckOpportunityLink"
Then user validate page is displayed "StuckOpportunityPageHeading" "Stuck Opportunities"


Scenario: TestCase20 Quaterly summary 
Then Click on the button "OpportunitiesTab"
Then User is on "OpportunityPage"
When User selects by visible Text "Interval" "Current and Next FQ"
When User selects by visible Text "Include" "Open Opportunities"
Then Click on the button "RunAndReport"






