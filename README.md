# RestNG
Rest Assured API Testing Framework Using Gradle and TestNG. 

Right now there is a cron job running the tests daily but it will also trigger when you commit and push a local branch. Plans to change this in the future to only run on a schedule and then have a CI runner for PRs only instead of just regular branch checks

To run the TestNG configuration:
./gradlew test -PSuite= {{add your xml here}}

additional .xml files can be added under the test resources to run with different configurations

TODO: 
- Get the test environment built and running using Jenkins locally
- Get the test environment running under K8s and the project building with a docker container that contains a mongoDB image for testing DB entries and reads