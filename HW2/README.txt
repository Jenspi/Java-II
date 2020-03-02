This program can find which String is first alphabetically when given two or more Strings. 

> COMPILE:
javac Recursion.java RecursionTester.java

> RUN JUNIT:
java org.junit.runner.JUnitCore RecursionTester

-------------------------
Note: I can't seem to figure out what is wrong with my JUnit tester and why it keeps the data from previous assertions, messing up the ones that follow. (Ex. An assertion will expect 0 in one test case, but the assertion in the next test case isn't supposed to expect 0, and ends up expecting it anyway. The problem trickles down all of the tests. I'd love some feedback on why it's happening or how to go about fixing it!)