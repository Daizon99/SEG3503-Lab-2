# seg3503_playground
| Outline | Value |
| --- | --- |
| Course | SEG 3503 |
| Date | Summer 2023 |
| Professor | Mohamed Ali Ibrahim |
| TA | Abonasara Joseph / Kasumba Joseph | 


Prerequisites:
Java 8 or 9 (JDK/JRE)
Command Line Git or or PowerShell for Windows users
Steps for invoking the User registration App jar file
Clone the seg3503_playground repository using the following command: git clone https://github.com/skyByt/seg3503_playground.git
Navigate to registration folder
Open Git command Line or PowerShell
use the following command to compile and invoke the registration App: bin/run
The following sceenshots highlight the results of each test case:

Test case 1
image

Test case 2
image

Test case 3
image

Test case 4
image

Test case 5
image

Test case 6
image

Test case 7
image

Test case 8
image

The aforementioned results are summarized in the following table:

Cas de test	Résultats escomptées	Résultats actuels	Verdict
1	Demande d’inscription acceptée	ERR4 et ERR5	Échec
2	Demande d’inscription acceptée	Demande d’inscription acceptée	Succès
3	Demande d’inscription acceptée	ERR4 et ERR5	Échec
4	Demande d’inscription acceptée	Demande d’inscription acceptée	Succès
5	ERR1	ERR3, ERR4, et ERR5	Échec
6	ERR1	ERR3	Échec
7	ERR1	ERR3, ERR4, et ERR5	Échec
8	ERR1	ERR1	Succès
ERR1: Wrong UserName format
ERR3: Size must be between 6 and 12
ERR4: Wrong FirstName format
ERR5: Wrong LastName format
Part 2:
Prerequisites:
Java 8 or higher
Command Line Git or or PowerShell for Windows users
Junit 4 and 5
Steps for invoking ecs test files
After implementing DateTest.java, DateNextDateOkTest.java, and DateNextDateExceptionTest.java, the following results should be obtained after:

compiling Java test classes with: javac -encoding UTF-8 --source-path test -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar test/*.java src/*.java
invoking Java test classes with: java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
image image
