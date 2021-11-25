Feature: feature to test login functionality

Scenario: verify calculatior functionality
Given user opens app url 
When user select single toggle button on ui 
And user selects zero dependent on ui 
And user selects home to live in toggle button on ui 
And user enters value to income field
And user enters value to other income
And user enters value to living expenses field
And user enters value to current home loan repayments
And user enters value to other loan repayments
And user enters value to other Commitments 
And user enters value to total card limits
Then user clicks on work out how much i could borrow button



Scenario: verify start over functionality
Given user clicks on start over button


Scenario: verify error message while leaving all field as zero
Given user select single toggle button on ui 
When user selects zero dependent on ui 
And user selects home to live in toggle button on ui 
And user enters value to income field
And user enters value to other income
And user enters value to living expenses field
And user enters value to current home loan repayments
And user enters value to other loan repayments
And user enters value to other Commitments 
And user enters value to total card limits
And user clicks on work out how much i could borrow button
Then user gets error message

