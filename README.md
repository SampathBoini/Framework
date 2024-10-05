# Page Object Model (POM) Framework with Java and Selenium

## Overview

Welcome to the **Page Object Model (POM) Framework** repository, built using **Java** and **Selenium WebDriver**. This project demonstrates a robust automation framework designed to make web testing more efficient, organized, and maintainable. By using the POM design pattern, the framework promotes a clear separation of concerns, making it easier to manage and scale automated test cases for web applications.

The framework has been designed to handle common automation tasks and to ensure that test scripts remain easy to understand, modify, and reuse. It includes the necessary tools for generating reports, logging information, and managing dependencies.

---

## Why Page Object Model?

The **Page Object Model (POM)** is a design pattern in test automation that allows for the creation of an object repository for web elements. In traditional test automation, test scripts can become difficult to manage as web elements are hardcoded into the scripts themselves. When the UI changes, it requires modifications in all test scripts.

The POM framework solves this problem by:

- **Centralizing web elements**: Page elements are stored in separate classes, making it easier to maintain and modify them without affecting test scripts.
- **Promoting code reusability**: Page methods can be reused across multiple test cases, improving efficiency.
- **Improving test readability**: Test scripts become easier to read and understand since the logic is abstracted into the page classes.

---

## Features of the Framework

This project includes several key features to ensure effective and efficient test automation:

1. **Selenium WebDriver**: The backbone of the framework, used for browser automation.
2. **TestNG**: For test management, including test execution, assertions, grouping, and generating basic reports.
3. **Page Object Model (POM)**: All web page elements are organized into separate Page Object classes for better maintenance and scalability.
4. **Maven**: Manages dependencies and allows for easy project build and execution.
5. **Log4j**: A robust logging utility to capture detailed logs of test executions.
6. **Extent Reports**: For generating user-friendly, detailed reports of the test run.
7. **Data-Driven Testing**: Tests are driven by external data sources like Excel files using Apache POI.
8. **Cross-Browser Testing**: Supports running tests across multiple browsers such as Chrome, Firefox, etc.

---

## Project Structure

The project follows a structured format that aligns with best practices for automation framework design.

```bash
.
├── src
│   ├── main
│   │   ├── java
│   │   │   └── pages           # Page classes representing the web pages (Page Objects)
│   │   └── resources
│   │       └── config          # Configuration files like log4j.properties, config.properties
│   ├── test
│   │   └── java
│   │       └── tests           # Test classes with the actual test scripts
│   └── resources
│       └── testdata            # Test data files (e.g., Excel) used for data-driven testing
├── pom.xml                     # Maven POM file for managing dependencies
├── test-output                  # TestNG output folder with reports
└── README.md                    # Documentation of the project
