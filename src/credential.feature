Feature: Navigation macys home page Validation

Scenario Outline: home page Credentials

Given open Browser
And navigate to Macys URL
When user click ok "shop by department"
And user click on "Men"
And user click on "Jeans"
Then user should be in mens jeans page

Examples:
|shopByDepartment|Men|Jeans|