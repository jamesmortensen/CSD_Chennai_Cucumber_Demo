Feature: List of rides available

As a guest traveller, I want to view the list of rides so that I can pick the one that gets me to the destination faster.

Scenario:  Guest traveller wants to find a ride.
Given A search box to enter source, destination, travel date and time
When A guest traveller clicks "View rides list" 
And There are rides found
Then  The list of rides appears on the screen.

Scenario:  Guest traveller wants to find a ride.
Given A search box to enter source, destination, travel date and time
When A guest traveller clicks "View rides list" 
And Nothing is found
Then A message displays saying "No rides available"

Scenario:  Guest traveller wants to find a ride.
Given A search box to enter source, destination, travel date and time
When A guest traveller enters blank source or destination and clicks "View rides list" 
Then A message displays saying "Source or destination must mot be blank"

Scenario:  Guest traveller wants to find a ride.
Given A search box to enter source, destination, travel date and time
When A guest traveller enters past date or time and clicks "View rides list" 
Then A message displays saying "Can't enter past date. Date and time must be in the future"

Scenario:  Guest traveller wants to find a ride.
Given A search box to enter source, destination, travel date and time
When A guest traveller enters invalid date or time and clicks "View rides list" 
Then A message displays saying "Invalid date or time. Date and time must be in the DD/MM/YYYY and HH:MM format"

