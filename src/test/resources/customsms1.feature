Feature: custom sms

As a guest traveller, I want to see sms 
Scenario:  Guest traveller wants to see sms.
Given A search box 
When A guest traveller clicks "enter" 
And  sms found
Then   "sms appears".
