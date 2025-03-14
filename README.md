# PetStore API Automation

## Overview
This project automates API testing for the PetStore API using Java, Rest-Assured, TestNG, and Allure for reporting.

## Technologies Used
- **Java** (JDK 8+)
- **Rest-Assured** (API automation framework)
- **TestNG** (Testing framework)
- **Maven** (Dependency management & build tool)
- **Allure** (Test reporting tool)

## Installation
1. **Clone the repository**
   ```sh
   git clone https://github.com/rrefaat/petstore-api-automation.git
   cd petstore-api-automation
   ```

2. **Install dependencies**
   ```sh
   mvn clean install
   ```

## Running Tests
To execute the test suite, use:
```sh
mvn test
```

## Generating Allure Reports
1. **Run tests with Allure results enabled:**
   ```sh
   mvn clean test
   ```
2. **Generate & view the report:**
   ```sh
   mvn allure:serve
   ```
This will open the test report in a browser.

## Project Structure
- `src/main/java/api/` → API Helper classes (e.g., `PetAPI.java`, `UserAPI.java`)
- `src/test/java/tests/` → Test cases (e.g., `PetStoreTests.java`, `UserTests.java`)
- `src/test/java/base/` → BaseTest setup class
- `src/main/java/utils/` → Configurations & utilities
- `allure-results/` → Stores test execution results
- `README.md` → Project documentation
- `pom.xml` → Maven dependencies & configurations

## Dependencies
See `requirements.txt` for required dependencies.

## Contribution
Feel free to fork this repo and submit pull requests.

## License
This project is licensed under the MIT License.

