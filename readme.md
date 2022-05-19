# Example Geb and Spock Project


## Description

This is an example of incorporating Geb into a Gradle build. It shows the use of Geb/Spock functional testing for testing my personal portfolio website.

The build is setup to work with Chrome. Have a look at the `build.gradle` and the `GebConfig.groovy` files.

## Usage

The following commands will launch the tests with Chrome:

    ./gradlew chromeTest
    ./gradlew chromeHeadlessTest


Replace `./gradlew` with `gradlew.bat` in the above examples if you're on Windows.

## Credits
Project based on initial example from Geb Github.
[geb-example-gradle]: https://github.com/geb/geb-example-gradle
