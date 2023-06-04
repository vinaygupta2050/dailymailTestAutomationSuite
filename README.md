# Dailymail WebApp Test Automation Framework

## Getting Started

Below is the project structure
```
|-- README.md
|-- dailymailTestSuite.xml
|-- logs
|   `-- logfile.log
|-- pom.xml
|-- screenshot
`-- src
    |-- main
    |   |-- java
    |   |   `-- com
    |   |       `-- dailymailapp
    |   |           |-- factories
    |   |           |   |-- BasePage.java
    |   |           |   |-- BaseTest.java
    |   |           |   |-- CapabilitiesFactory.java
    |   |           |   `-- DriverFactory.java
    |   |           |-- listeners
    |   |           |   `-- TestListeners.java
    |   |           |-- pageobjects
    |   |           |   |-- LandingPageObject.java
    |   |           |   |-- NavigationbarPageObject.java
    |   |           |   `-- TelevisionPageObject.java
    |   |           |-- pages
    |   |           |   |-- LandingPage.java
    |   |           |   |-- NavigationBar.java
    |   |           |   `-- TelevisionPage.java
    |   |           `-- utility
    |   |               `-- fileoperation
    |   |                   `-- PropertiesFileReader.java
    |   `-- resources
    `-- test
        |-- java
        |   `-- com
        |       `-- dailymailapp
        |           `-- test
        |               `-- ViewArticleFlow.java
        `-- resources
            `-- config
                |-- env
                |   `-- QA.properties
                |-- logger
                |   `-- log4j.properties
                `-- testRunner
                    `-- SeleniumGrid.properties

```
Description
-   factories : This directory is the heart of framework and it has some major component which drives the whole framework
-   listeners : This consist of all the test listeners which needs to be executed on certain actions
-   pageobject: In this package all the web elements of application page are stored.
-   pages : In this package all the application pages and their respective actions are written
-   testData : In this package we will be creating our dataprovider class where we can store/manipulate test data which are required to execute our test with different set of data
-   utils : In this package contains different utility which we can use while we are writing our automation test like wait function, Different file operation
-   test/resources : This consist of config.properties file where all the application url and test user are present and testng.xml file which we use to run our automation test
-   tests     : This directory where we write our test.
-   screenshot : This directory is responsible for storing failed test case screenshot after run
-   logs : This directory is responsible for storing failed test case screenshot after run
### Prerequisites

Please download below applications and jar before we run our framework

```
-   JDK 1.8 or higher
-   maven
```

## Writing Test

Once you have finished your configuration you can begin writing your test by extending BaseTest to your respective test. Below is the sample code.
```
    @Test(enabled = true, description = "Verify whether user is able to view article list based on category selected",
            groups = "Task1")
    public void verifyUserIsAbleToViewArticleListBasedOnCategorySelected() {
        LandingPage landingPage = new LandingPage(driver.get());
        landingPage.acceptAllCookie().verifyTitle()
                .selectCategoryAndSubCategoryAs(CATEGORY_TECH,"Televisions")
                .verifySubCategoryTitle("Televisions")
                .verifySubCategoryDescription("The right TV can make spending time at home feel like a luxury. Whether you’re looking for a big-screen setup, a smart TV to stream your favorite shows or a more discreet option to match your home decor, we’ve got you covered. Our editors have done extensive research and compared across top brands to help you find the perfect TV — with the exact screen size, features and resolution that you’re after.")
                .verifyArticleSectionIsDisplayed();
    }

```

## Running the tests

To Run from IDE
-   Simply navigate to "testng.xml".
    Right click on the file and select option Run to the test

To Run from command-line
-   In the project directory use below command to run the test
```
mvn clean test -Denv="QA" -DrunOn="LOCALHOST" -Dbrowser="CHROME"
```

## After run of test
Below directory are usefull after running the test
- target/surefire-reports/index.html : Under this directory we can find plain testng reports
- screenshot: All the screenshot for failed test can be found here

### Break down into end to end tests

The scenarios which I have tried to cover and present in below files
- verifyUserIsAbleToViewArticleListBasedOnCategorySelected

```
-   Verify whether user is able to view article list based on category selected
```

### And coding style tests

I have used testNG and its annotation to write the automation test

### Execution logs

[ExecutionVideo/dailymailTestSuiteExecutionLogs.gif](https://github.com/vinaygupta2050/dailymailTestAutomationSuite/blob/main/ExecutionVideo/dailymailTestSuiteExecutionLogs.gif)

## Authors

* **Vinaykumar Gupta**
