I have run the automation on calculator application for both PRDO and STAGING environment and here is the report.

How to Run:
    1. Navigate to config.properties file and uncomment the env.url for the desired environment and comment out the one not needed. I have made this to make it just a simple. If needed we can create environment files for each environment

    2. Navigate to Runner Class and run it from there.


1. PROD environment report
    - Is running as expected.- After the run, navigate to target/html-report/cucumber-reports.html to see the result



2. STAGING environment report
    - After the run, navigate to target/html-report/cucumber-reports.html to see the result
    - Based on our findings:
        - Number 5 is not functioning correctly. Once clicked, instead of 5 it shows 6
        - Displayed numbers are not in the right location.
        - Also, decimal numbers does not get calculated correctly.