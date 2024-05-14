# Trip Package Automation

## Overview

This repository contains automation scripts designed to test the search functionality of online travel booking websites, focusing on listing and validating package deals.

## Problem Statement

Automate the search functionality and list the search results from an online booking website, focusing on available packages, validating the browser title, and ensuring special offers are displayed correctly.

### Key Features

- Automate the interaction with travel booking websites like Yatra.com.
- Validate browser titles and special offer banners.
- Capture screenshots of the search results and validate them.
- List top holiday packages along with their prices.

### Detailed Description

- **Browser Launch**: Open any specified browser (e.g., Chrome, IE) based on user input.
- **Open Website**: Navigate to [Yatra.com](https://www.yatra.com/).
- **Interaction**: Click on the "Offers" link on the homepage.
- **Validation**:
  - Check if the browser's title matches expected text.
  - Verify the presence of promotional banners with specific text.
- **Capture and List**:
  - Take screenshots of the browser window.
  - List five holiday packages with detailed pricing.
- **Closure**: Safely close the browser after tests.

## Key Automation Scope

- **Browser Compatibility**: Handle multiple browsers like Chrome, IE, and Firefox.
- **Synchronization**: Use effective synchronization techniques to manage element visibility and interaction timings.
- **Precise Element Location**: Use advanced techniques for locating web elements.
- **Exception Handling**: Robust handling of potential runtime exceptions.
- **Dropdown Management**: Handle interactions with dropdown lists effectively.

## Repository Structure

- **Configuration**: Settings and configuration files.
- **Drivers**: Browser driver files for Chrome, Firefox, and Edge.
- **Screenshots**: Stores screenshots from test executions.
- **src**: Source code of the automation scripts.
- **test-output**: Stores detailed test execution reports.
- **TestData.xlsx**: Input data for tests.
- **Recording090709-Trip Package Automation.mp4**: Video recording of the test execution.

## Prerequisites

- **Java**: JDK 1.8.0_271
- **Selenium WebDriver**: 3.141.59
- **Apache POI**: 5.0.0
- **Web Browsers**:
  - Chrome: 90.0.4430.24
  - Firefox: 127.0.0.1.4444
  - Edge: 89.0.774.77

## Setup and Execution

1. **Clone the Repository**:
```bash
git clone https://github.com/vinayvaida27/Trip-Package-Automation.git
```

2. **Install Dependencies**:
- Ensure Java and all browser drivers are correctly installed and configured.
3. **Run Tests**:
- Navigate to the project directory.
- Use a suitable Java IDE or command line to execute tests.

## Output Summary

The automated tests verify several key aspects of the website functionality and appearance. Below is a summary of the tests performed and the output captured through screenshots, which provide visual proof of the test results:

- **Title Verification**: Confirms that the browser title is as expected.
  - **Test Status**: Passed
  - ![Title Verification Screenshot](./Screenshots/20/04/2021.png)

- **Banner Verification**: Checks for the correct promotional banner.
  - **Test Status**: Passed
  - ![Banner Verification Screenshot](./Screenshots/21/04/2021.png)

- **Holiday Packages Listed**: The top five holiday packages are listed with detailed pricing.
  1. **Sri Lanka Packages**: Starting at ₹24,990 Per Person
     - ![Sri Lanka Packages Screenshot](./Screenshots/22/04/2021.png)
  2. **Ladakh Packages**: Starting at ₹37,999 Per Person
     - ![Ladakh Packages Screenshot](./Screenshots/24/03/2021.png)
  3. **Chardham Packages**: Starting at ₹159,999 Per Person
     - ![Chardham Packages Screenshot](./Screenshots/25/03/2021.png)
  4. **Himachal Packages**: Starting at ₹6,499 Per Person
     - ![Himachal Packages Screenshot](./Screenshots/20/04/2021.png)  <!-- Assuming a placeholder, adjust as needed -->
  5. **North East India Packages**: Starting at ₹9,099 Per Person
     - ![North East India Packages Screenshot](./Screenshots/21/04/2021.png) <!-- Assuming a placeholder, adjust as needed -->

Each screenshot is stored in a folder corresponding to the date of the test execution, providing an organized and chronological view of the testing process and outcomes.

## Reviewing Test Screenshots

To review the detailed screenshots of each test case, you can navigate to the `Screenshots` directory in this repository. Each test case's screenshot is categorized by date, allowing for easy tracking and verification of the test results over time.

For any discrepancies or issues observed from the screenshots, please refer to the corresponding test execution date and report the issue under the repository's issues section or directly contact the maintainers.


## Contact

For further inquiries or issues, please contact [vinayvaida@gmail.com](mailto:vinayvaida@gmail.com) or visit my [LinkedIn profile](https://www.linkedin.com/in/vinayvaida/).

