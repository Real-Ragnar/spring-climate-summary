# Spring Climate Summary

There are two web pages created, one for a general view of the climate summary csv file and the other webpage is for a more detailed view. The csv file is in the top most branch of the project. 

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Thymeleaf with Java 8 
Maven

```
TODO
```

### Installing

Clone this repository and open in project in Spring Tool Suite 


## Running the program (mac)
1. Clone the application

git clone https://github.com/Real-Ragnar/spring-climate-summary.git

2. Ensure you do not have any interfering processes on port 8080

To list any process listening to the port 8080:
lsof -i:8080

To kill any process listening to the port 8080:
kill $(lsof -t -i:8080)

or more violently:
kill -9 $(lsof -t -i:8080)

or more specifically:
kill -9 (pid # of the process)

3. Run the project via CLI

Navigate to the path of the installed project (command "cd")
Use "java -jar Quiz-0.0.1-SNAPSHOT.jar" to start the project,
where "Quiz-0.0.1-SNAPSHOT" is the name of the generated jar file.

4. Optionally build and run the app using maven and CLI
Create jar file:
mvn clean package

Move jar file to convenient location

## Running the tests
```
TODO
```
## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Author

* **Steven Souksanh** - *Initial work*

