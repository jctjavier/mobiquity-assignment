# mobiquity-assignment
##### status : *incomplete*
### Test Scenarios Covered
- Verify that the user is able to successfully login to Cafe Townsend with valid credentials
- Verify that the user is unable to login to Cafe Townsend with invalid credentials
- Verify that an error message is displayed when invalid credentials are submitted

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

### Troubleshooting
1. Verify that web driver binaries are compatible to browsers used


