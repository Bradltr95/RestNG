# RestNG

**RestNG** is a lightweight and scalable API testing framework built with **Rest Assured**, **Gradle**, and **TestNG**.

---

## Summary

This project is designed to provide a maintainable and extensible base for REST API testing. It leverages TestNG for test execution, Gradle for build automation, and Rest Assured for fluent and readable HTTP request handling.

---

## Project Setup

### Requirements
- **Java:** JDK 22 or lower
- **Gradle:** 8.8 or higher (Gradle wrapper included)

### Getting Started

#### Manual Setup
```bash
./gradlew build
```

> If you're not using the wrapper:
```bash
gradle build
```

#### Using an IDE
Most modern IDEs (like IntelliJ IDEA or Eclipse) offer Gradle integration:
1. Locate the Gradle tab (usually on the left or right panel).
2. Click the **elephant** icon to view tasks.
3. Run the `build` task from there.

#### Troubleshooting
Gradle's error messages are generally informative—follow the suggestions in the terminal if the build fails.

---

## CI & Automation

### Daily Test Execution
- Tests are scheduled via a cron job to run **daily**.
- Commits to local branches also trigger test execution.
- **Coming Soon:** Tests will run only on schedule and during PR creation (to avoid triggering on all branch pushes).

---

## Running Tests

### Running Default Suite
```bash
./gradlew test -PSuite=UserTestSuite_test.xml
```

### Running Custom Suites
```bash
./gradlew test -PSuite=YourSuiteName_test.xml
```

> Place your custom suite `.xml` files under `src/test/resources`.

---

## Code Style & Linting

### Spotless Linting (Enforced in CI)

- Check for issues:
```bash
./gradlew spotlessCheck
```

- Automatically fix formatting:
```bash
./gradlew spotlessApply
```

> If not using the wrapper:
```bash
gradle spotlessApply
```

---

## Test Suite Naming Convention

- Suite files must follow this pattern:  
  `MyTestSuite_test.xml` (PascalCase + `_test.xml` suffix)

---

## Commit Guidelines

Every commit title must start with one of the following prefixes:
- `task:` – for new features or functionality
- `update:` – for changes without new features
- `fix:` – for minor bug fixes
- `hotfix:` – for urgent fixes to production-breaking bugs

> _Tip: If your commit includes multiple types, consider breaking it up into smaller commits._

---

## TODO

- [ ] Set up Jenkins to run the tests locally
- [ ] Run the test framework inside Kubernetes
- [ ] Integrate with a Docker container including a MongoDB instance for DB-level testing

---
