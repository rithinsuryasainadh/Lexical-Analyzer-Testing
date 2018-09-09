# Lexical-Analyzer-Testing

DESCRIPTION
---
This project is to practice the basic concepts, principles, and techniques covered
in the Software Testing course. In this project, we tested and debugged a java program. In particular, applied control
flow testing to test printTokens2.java, a java implementation of Lexical analyzer that converts an input
string to a sequence of tokens.   

INTRODUCTION
---
The java class file printTokens2.java had around 500 lines of code
and 18 methods(LOC); converts the input string into one of eight types of tokens namely keyword,
Special symbol, String, Identifier, Integer, Char, Comment and Error. To perform testing and
debugging of printTokens2.java, we require the following tools: Eclipse IDE, jUnit test framework,
JaCoCo plugin for Eclipse.


Steps implemented to complete this project
---
1. Drawing the control flow graphs(CFG) for each method.  
2. Developing test cases for each of the selected method to achieve edge coverage, including
main method.
3. Used JUnit to implement and execute the identified test cases.
4. Provided the code coverage report using Jacoco(lines, branches) for tests.
* All the methods beside main method. (Focusing on covering as much code as possible
for each method)
* Only the main method itself. (End to end test, focusing on covering as much code as
possible for the whole program)
