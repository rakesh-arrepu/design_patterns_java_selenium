
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

**This framework is ready for real projects and quick demo POCs alike. See code comments and provided samples for more customization options!**

