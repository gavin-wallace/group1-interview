Feature: Validating Multiple Windows page elements from LCP website

  Background:
    Given user is on LCP Multiple Windows page

  Scenario: Validate title is "Windows"
    Then validate Powered by Loopcamp message is displayed
    Then url title is as Windows
    When user clicks on Click Here button
    Then validate window switch and switched window title

#  /*
#  go to https://loopcamp.vercel.app/
#  click "Multiple Windows" link
#  Validate "Powered by Loopcamp" is displayed
#  Validate title is "Windows"
#  Click - click here
#  Switch to new window and validate title
#  */