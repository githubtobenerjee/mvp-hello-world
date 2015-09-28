This project is an attempt to show how to do a MVP pattern in Java. This project will use a set action for the views instead of characteristic interfaces.

The program is very low level and doesn't use any kind of dependency injection but it's a good way to show how something like this would be setup.

The benefit of this MVP pattern is that the real logic of the program is very testable and doesn't rely on any GWT specific code. Any tests written in JUnit should running in milliseconds instead of the normal 10-20 seconds for a GWT test case. Also it doesn't require an Android emulator to test the business logic.