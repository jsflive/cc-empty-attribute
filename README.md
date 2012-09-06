This a test for the behavior of JSF 2 composite component attributes with empty values. In some cases empty attributes can lead to unexpected behavior.

The problem only occurs with MyFaces before version 2.0.10 or 2.1.4 and apparently on any 2.0 and 2.1 version of Mojarra.

There are three ways to start the test application (with different outcomes):

* `mvn jetty:run`: Does not show the error as MyFaces is used in a new version including a fix. Change the MyFaces version to 2.1.3 in the `pom.xml` to actually see the error.
* `mvn jetty:run -P mojarra`: Shows the error as Mojarra 2.1 is used.
* `mvn jetty:run -P mojarra22`: Does not show the error as a snapshot of Mojarra 2.2 is used including a fix.
