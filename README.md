# Selenium TestNG Cucumber Framework

![GitHub Repo stars](https://img.shields.io/github/stars/rakesh-arrepu/design_patterns_java_selenium?style=social)
![GitHub last commit](https://img.shields.io/github/last-commit/rakesh-arrepu/design_patterns_java_selenium)
![GitHub issues](https://img.shields.io/github/issues/rakesh-arrepu/design_patterns_java_selenium)
![GitHub license](https://img.shields.io/github/license/rakesh-arrepu/design_patterns_java_selenium)
# design_patterns_java_selenium


A modern, production-ready automation framework combining Selenium WebDriver, TestNG, and Cucumber for web testing. Designed for easy scalability, modularity, and robust test practices.

---

## ✨ Key Features

- **Dual Approach:** Run tests with TestNG & Cucumber (BDD)
- **Cross-Browser:** Chrome, Firefox, Edge, Safari support
- **Parallel Execution:** Multi-threaded via TestNG/Cucumber
- **Screenshot Management:** Capture on pass/fail
- **Data-Driven:** Excel (Apache POI), JSON (Jackson), random data
- **Advanced Reporting:** ExtentReports, Cucumber HTML, TestNG built-in
- **Configuration:** Properties-driven settings
- **Logging:** Log4j2 with custom levels
- **CI/CD Ready:** Maven profiles, command-line, headless support
- **Best Practices:** Page Object Model, waits, retry logic, clean code

## 🛠️ Initial Structure

```
SeleniumTestNGCucumberFramework/
├── src/
│   ├── main/java/com/framework/         # Driver, utils, core infra
│   ├── test/java/com/tests/             # TestNG & Cucumber tests
│   └── test/resources/                  # Properties, Excel, JSON, feature files
├── reports/                             # Test & HTML reports
├── scripts/                             # Bash/batch execution scripts
├── pom.xml                              # Modern dependencies/test config
├── README.md                            # This file
```
## 🛠️ Setting Up the Project

### 1. Clone the Repository
Clone the project from GitHub:
```sh
git clone https://github.com/rakesh-arrepu/design_patterns_java_selenium.git
cd design_patterns_java_selenium
```

### 2. Install JDK 22

#### For macOS:
1. Download JDK 22 from the official Oracle or OpenJDK website:
   - [Oracle JDK 22](https://www.oracle.com/java/technologies/javase-downloads.html)
   - [OpenJDK 22](https://openjdk.org/)
2. Set the `JAVA_HOME` environment variable:
   ```sh
   export JAVA_HOME=/path/to/jdk-22
   export PATH=$JAVA_HOME/bin:$PATH
   ```
3. Verify the installation:
   ```sh
   java -version
   ```

#### For Windows:
1. Download JDK 22 from the official Oracle or OpenJDK website:
   - [Oracle JDK 22](https://www.oracle.com/java/technologies/javase-downloads.html)
   - [OpenJDK 22](https://openjdk.org/)
2. Install the JDK and note the installation path (e.g., `C:\Program Files\Java\jdk-22`).
3. Set the `JAVA_HOME` environment variable:
   - Open **System Properties** > **Advanced** > **Environment Variables**.
   - Add a new system variable:
      - Variable name: `JAVA_HOME`
      - Variable value: `C:\Program Files\Java\jdk-22`
   - Edit the `Path` variable and add `%JAVA_HOME%\bin`.
4. Verify the installation:
   ```cmd
   java -version
   ```

### 3. Install Maven

#### For macOS:
1. Download Maven from the official website:
   - [Maven Download](https://maven.apache.org/download.cgi)
2. Extract the archive and move it to a directory (e.g., `/usr/local/apache-maven`).
3. Set the `MAVEN_HOME` environment variable:
   ```sh
   export MAVEN_HOME=/path/to/maven
   export PATH=$MAVEN_HOME/bin:$PATH
   ```
4. Verify the installation:
   ```sh
   mvn -version
   ```

#### For Windows:
1. Download Maven from the official website:
   - [Maven Download](https://maven.apache.org/download.cgi)
2. Extract the archive to a directory (e.g., `C:\Program Files\Apache\Maven`).
3. Set the `MAVEN_HOME` environment variable:
   - Open **System Properties** > **Advanced** > **Environment Variables**.
   - Add a new system variable:
      - Variable name: `MAVEN_HOME`
      - Variable value: `C:\Program Files\Apache\Maven`
   - Edit the `Path` variable and add `%MAVEN_HOME%\bin`.
4. Verify the installation:
   ```cmd
   mvn -version
   ```

### 4. Import the Project into IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Go to `File > Open` and select the cloned project directory.
3. Set the SDK to JDK 22:
    - Go to `File > Project Structure > SDK` and select JDK 22.
4. Maven will automatically import dependencies from the `pom.xml` file.
   https://intellij-support.jetbrains.com/hc/en-us/community/posts/360010215699-Set-up-a-project-SDK

## 🚀 Getting Started

**Import** the project into your IDE.

**Install dependencies:**
```sh
mvn clean install
```

**Execute sample TestNG tests:**
```sh
mvn test -DsuiteXmlFile=testng.xml
```

**Execute Cucumber features:**
```sh
mvn test -Dcucumber.options="src/test/resources/features"
```

## 🧩 Extending the Framework

- Put base/config/driver utilities in `com.framework`
- Add new page objects under `com.framework.pages`
- Add testcases under `com.tests`
- Place BDD feature files under `src/test/resources/features`
- Add Excel/JSON test data to `src/test/resources/data`
- Configure browsers, threads, and environment via `config.properties`

## 📝 Best Practices

- Use explicit waits, page-factory patterns, and avoid driver-level sleeps.
- Tag BDD features & tests for flexible execution.
- Utilize logging and screenshot capture on all failures.
- Integrate with CI tools using provided Maven profiles.

---
