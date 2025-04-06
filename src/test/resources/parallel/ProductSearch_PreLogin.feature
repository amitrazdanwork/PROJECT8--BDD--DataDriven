Feature: Product Search - Pre Login

  @Smoke
  Scenario: Verify Page title of What's new page is "What's New"
    Given User is on What's new page
    When User gets the page title
    Then title of the page is "What's New"

  @Smoke
  Scenario Outline: Verify product search functionality on What's new page
    Given User is on What's new page
    And Search textbox is displayed on What's new page
    When User enters "<search_val>" in Search textbox on What's new page
    And User clicks on Search icon on What's new page
    Then User gets the result outcome for "<search_val>" on What's new page
    Examples: 
      | search_val |
      | Jacket     |
      | Bag        |

  Scenario: Verify Page title of Women page is "Women"
    Given User is on Women page
    When User gets the page title
    Then title of the page is "Women"

  Scenario Outline: Verify product search functionality on Women page
    Given User is on Women page
    And Search textbox is displayed on Women page
    When User enters "<search_val>" in Search textbox on Women page
    And User clicks on Search icon on Women page
    Then User gets the result outcome for "<search_val>" on Women page
    Examples: 
      | search_val |
      | Jacket     |
      | Bag        |

  Scenario: Verify Page title of Women page is "Men"
    Given User is on Men page
    When User gets the page title
    Then title of the page is "Men"

  Scenario Outline: Verify product search functionality on Men page
    Given User is on Men page
    And Search textbox is displayed on Men page
    When User enters "<search_val>" in Search textbox on Men page
   And User clicks on Search icon on Men page
    Then User gets the result outcome for "<search_val>" on Men page
    Examples: 
      | search_val |
      | Jacket     |
      | Bag        |

  Scenario: Verify Page title of Women page is "Gear"
    Given User is on Gear page
    When User gets the page title
    Then title of the page is "Gear"

  Scenario Outline: Verify product search functionality on Gear page
    Given User is on Gear page
    And Search textbox is displayed on Gear page
    When User enters "<search_val>" in Search textbox on Gear page
    And User clicks on Search icon on Gear page
    Then User gets the result outcome for "<search_val>" on Gear page
    Examples: 
      | search_val |
      | Jacket     |
      | Bag        |

  Scenario: Verify Page title of Trainings page is "Training"
    Given User is on Training page
    When User gets the page title
    Then title of the page is "Training"

  Scenario Outline: Verify product search functionality on Trainings page
    Given User is on Training page
    And Search textbox is displayed on Training page
    When User enters "<search_val>" in Search textbox on Training page
    And User clicks on Search icon on Training page
    Then User gets the result outcome for "<search_val>" on Training page
    Examples: 
      | search_val |
      | Jacket     |
      | Bag        |

  Scenario: Verify Page title of Women page is "Sale"
    Given User is on Sale page
    When User gets the page title
    Then title of the page is "Sale"

  Scenario Outline: Verify product search functionality on Sale page
    Given User is on Sale page
    And Search textbox is displayed on Sale page
    When User enters "<search_val>" in Search textbox on Sale page
    And User clicks on Search icon on Sale page
    Then User gets the result outcome for "<search_val>" on Sale page
    Examples: 
      | search_val |
      | Jacket     |
      | Bag        |
