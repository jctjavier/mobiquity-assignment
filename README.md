# mobiquity-assignment
##### status : *complete* :+1:

### Test Scenarios Covered
- Verify that the user is able to successfully login to Cafe Townsend with valid credentials
- Verify that the user is unable to login to Cafe Townsend with invalid credentials
- Verify that an error message is displayed when invalid credentials are submitted
- Verify that the user is able to log out successfully

### Project Details
- This project utilizes an external repository as a maven dependency:
```
https://github.com/jctjavier/common
```
- This project utilizes TestNG as the testing framework.
- This project utilizes Maven as the project management tool / package/dependency manager.
- This project utilizes Java as the main programming language.
- This project utilizes Selenium as the main web driver for the web browsers. 

### Pre-requisites
- Java JDK installed and added to environment variables
- Maven installed and added to environment variables
- Git installed
- Chrome / Firefox Browser Installed

### Project Set-up
1. Clone project using the following command: 
```
git clone https://github.com/jctjavier/mobiquity-assignment.git
```

2. _(Optional)_ Install project dependencies
```
mvn clean install
```

3. Open **config.properties** in **\lib** to verify project and test information. Default browser is set to *chrome*

### Run Tests
1. Open CMD or terminal
2. Change directory to project directory.
Example:
```
cd mobiquity-assignment
```

3. Run tests using the following command:
```
mvn clean install test
```

4. _(Optional)_ Subsequent tests can be run using the following command:
```
mvn test
```

### Test Reports
1. Navigate to project folder
2. Navigate to **\ExtentReports** folder
3. File name is **ExtentReportResults.html**

### Project Details
Below are the versions used for this project:
* Java SDK 8
* Maven 4.0.0
* Selenium 3.14.0
* Selenium Server 3.14.0 
* TestNG 6.14.3
* Extent Reports 2.41.2

### Thought Process
* I had already created a common repository using TestNG and Selenium as part of the framework. It is far from refined, and I've had to tweak it when I started this assignment. 
* I have decided to use a page object model framework, since I was dealing with a web application.
* I have included comments in the code to explain what each class and method is for.
* There are classes and elements that are not used and with TODO tags, since I initially decided to work with extra test cases. However, due to time constraints, I have decided to work with less. 

### Troubleshooting
1. Verify that web driver binaries are compatible to browsers used


