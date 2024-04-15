Feature: Usermenu scenarios
Background: Launch the application and login
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then user waits for Element "Username"
Then User Enter into text box "Username" "teena@raghav.com"
Then User Enter into text box "Password" "pritishtina@1"
Then Click on the button "Login"
Then User is on "UsermenuPage"


@myprofile
Scenario: Check for the usermenu
Then Click on the button "Usermenu"

@myprofile
Scenario: Edit Lastname in My profile page 
Then Click on the button "Usermenu"
Then Click on the button "MyProfile"
Then Click on the button "Edit"
When User switches to the frame "AboutFrame"
And Click on the button "AboutTab"
Then User Enter into text box "LastName" "Raghav"
And Click on the button "SaveAll"
Then User Switches back to default frame
Then User is on "HomePage"

@myprofile
Scenario: Post on My profile page
Then Click on the button "Usermenu"
Then Click on the button "MyProfile"
And Click on the button "PostLink"
When User switches to the frame "PostFrame"
Then User Enter into text box "PostTextArea" "We're continuously striving to improve our services.Share your feedback with us by completing a quick survey.Your input is valuable in helping us enhance your experience!"
Then User Switches back to default frame
And Click on the button "PostShare"

@myprofile
Scenario: Upload a file 
Then Click on the button "Usermenu"
Then Click on the button "MyProfile"
And Click on the button "FileLink"
And Click on the button "UploadFromComputer"
Then User selects file to upload "ChooseFile" "C:\Users\teena\OneDrive\feb2024\java\codingfilestoreadwrite\test.txt"
Then user waits for Element "FileShare"
And Click on the button "FileShare"
Then File should be Successfully uploaded "File" "test"

@myprofile
Scenario: Upload photo
Then Click on the button "Usermenu"
Then Click on the button "MyProfile"
Then User is on "HomePage"
When User hover over the element "ProfileImage"
Then Click on the button "AddProfilePhoto"
When User switches to the frame "AddPhotoFrame"
Then User selects photo to upload "ChoosePhoto" "C:\\Users\\teena\\Downloads\\image1.jpg"
Then Click on the button "ChoosePhotoSave"
Then User waits to load page
Then Click on the button "SavePhoto"
Then User waits to load page


@mysettings
Scenario: Edit My settings
Then Click on the button "Usermenu"
Then Click on the button "MySettings"
Then Click on the button "PersonalInfo"
Then Click on the button "LoginHistory"
Then User Click On the Link "LoginHistoryLink"
Then Click on the button "DisplayAndLayout"
Then Click on the button "CustomizeMyTab"
When User selects by visible Text "CustomApp" "Salesforce Chatter"
Then User selects by value "ReportTab" "report"
Then Click on the button "AddTab"
Then Click on the button "Save"



Scenario: Edit Email in My settings
Then Click on the button "Usermenu"
Then Click on the button "MySettings"
Then Click on the button "EmailTab"
Then Click on the button "MyEmailSetting"
Then User Enter into text box "EmailName" "TeenaRTomar"
Then User Enter into text box "EmailAddress" "teena@singh.com"
Then User Click on the Radio button "YesRadioButton"
Then Click on the button "Save"
Then User Accept the alert

@test
Scenario: Edit Email in My settings
Then Click on the button "Usermenu"
Then Click on the button "MySettings"
Then Click on the button "CalendarsAndReminders"
Then Click on the button "ActivityReminders"
Then Click on the button "TestReminder"










