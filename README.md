# venky_spring-boot-jpa-h2

This Repo to demonstrate how to use the Spring Hibernate JPA works within Spring 4. This sample repo has few very simple 
UseCases such as adding new Employees to a deportment, retrieving all Employees from a given Department.

Anyone can leverage this as a Base Spring Boot App if you have simialar needs.


Build Capablities :
Would work with Maven as well as Gradle

Key Capablities :

Using CRUP Repo interfaces which abstracts the Core java(hibernate) code that performs CRUD (Create, Read, Update, Delete) 
operations.
    public interface DepartmentRepository extends CrudRepository<Department, Long>

    
How to run :

H2 DB Set up :

    Download H2 DB from http://www.h2database.com/html/download.html
    
    Install H2 : 
    
    Start H2  :
    
    /Applications/AllMyProjects/h2/bin/h2.sh
    
 Install Grandle 
 
     https://gradle.org/install/
 
 Install Maven
    
    https://maven.apache.org/download.cgi
 
 Run Spring Boot App:
 
     Go to the Souce code folder

     ./gradlew bootRun


