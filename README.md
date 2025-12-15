# Sauce Demo Cucumber Java Assessment

<!-- Badges: Uncomment and update if you add CI/build tools -->
<!-- ![Build Status](https://img.shields.io/github/workflow/status/yourusername/yourrepo/CI) -->
<!-- ![License](https://img.shields.io/badge/license-MIT-green) -->

This repository contains a small Cucumber + Java test automation framework for the Sauce Demo application. The tests are built with Maven and organized using the Page Object Model (POM) and Cucumber feature files.

## Quick overview

- Language: Java
- Test runner: Cucumber (JUnit)
- Build: Maven
- Browser: WebDriver (configured in `Utils/BrowserFactory`)

## Dependencies

- Selenium WebDriver
- Cucumber JVM
- JUnit
- (See `pom.xml` for the full list)

## Project structure

- `pom.xml` - Maven project file with dependencies and test configuration.
- `src/test/java/Pages/` - Page object classes (e.g., `LoginPage`, `LandingPage`, `YourCartPage`, `InformationPage`, `CheckOutOverviewPage`).
- `src/test/java/Steps/` - Cucumber step definitions (`StepsDefinition.java`).
- `src/test/java/Runners/` - Test runner(s) (e.g., `runner.java`) used to start Cucumber scenarios.
- `src/test/java/Utils/` - Base test classes and helpers (`Base.java`, `BrowserFactory.java`).
- `src/test/resources/Features/` - Cucumber `.feature` files (e.g., `Purchase.feature`).
- `Reports/` - Human-readable HTML reports (e.g., `cucumber-reports.html`).
- `target/` - Maven build outputs and generated test artifacts (including `cucumber.json`).

> Note: Compiled `.class` files are under `target/test-classes/` when tests are built.

## Prerequisites

- Java JDK 11+ installed and `JAVA_HOME` set.
- Maven installed and available on PATH.
- Recommended: Use an IDE such as IntelliJ IDEA or Eclipse for running individual runners.

## Environment Variables

If you need to configure the browser or other settings, set the following environment variables (if supported by your framework):

- `BROWSER` (e.g., `chrome`, `firefox`)
- (Add more as needed)

Example (PowerShell):

```powershell
$env:BROWSER = "chrome"
```

## How to run tests

From the repository root (PowerShell):

```powershell
# Run the full test suite with Maven
mvn test
```

To run the JUnit/Cucumber runner directly from your IDE, open `src/test/java/Runners/runner.java` and run the class as a JUnit test.

If the project supports tags (check the runner configuration), you can pass tag filters via Maven system properties or configure the runner in the IDE. Example (if supported by your setup):

```powershell
# Example: run tests matching a tag (adjust according to your runner config)
mvn test -Dcucumber.filter.tags="@yourTag"
```

## Reports

- After a run, check `Reports/cucumber-reports.html` for a human-friendly HTML report (if the reporting step is configured in the build).
- The raw Cucumber JSON is available at `target/cucumber.json` for integrations (CI, report generators).

## Adding new tests

1. Add a new feature file under `src/test/resources/Features/` (Gherkin syntax).
2. Implement step definitions or reuse existing ones in `src/test/java/Steps/`.
3. If needed, add or update a Page Object in `src/test/java/Pages/`.
4. Run the tests via Maven or the runner in your IDE.

## Tips & conventions

- Keep page interactions in Page classes and avoid complex logic in step definitions.
- Use `Utils/Base` for shared setup/teardown and `Utils/BrowserFactory` for driver creation.
- Keep feature files focused on behavior (one scenario per distinct behavior).

## Troubleshooting

- If a test fails due to a driver/browser issue, ensure the proper browser binary/driver is available or that the project is configured to use WebDriverManager.
- If Maven build fails, run `mvn -X test` for detailed debug output.

## Contribution

Contributions are welcome! Please fork the repository and submit a pull request. For major changes, open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Next steps / Improvements

- Add CI configuration (e.g., GitHub Actions) to run the suite on push.
- Add more granular example tags and a README section showing how to run tagged subsets.
- Add automated report generation into `Reports/` as a post-test step.

---

If you want, I can also add a short CONTRIBUTING.md, create sample run configurations for IntelliJ, or add a GitHub Action workflow to run tests on push.
