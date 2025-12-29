install JAVA 17.0.17
install JAVA JDK 17
or
install JAVA 22.0.1
install JAVA JDK 22.0.1

install Maven
{
    https://maven.apache.org/download.cgi,
    apache-maven-3.9.x-bin.zip,

    Extract it to: 
        "C:\Program Files\Apache\Maven",

    Under System variables: New variable
        Variable name: MAVEN_HOME
        Variable value: C:\Program Files\Apache\Maven\apache-maven-3.9.x,

    Edit Path
        Add new line:
        %MAVEN_HOME%\bin
}

Go back to your project(in terminal):
    cd BankApp-Spring-Boot
    mvn clean package
    java -jar target/bankapp-0.0.1-SNAPSHOT.jar

to see output "http://localhost:8080"

to see database "http://localhost:8080/h2-console"
{
    JDBC URL: jdbc:h2:mem:bankdb
    User: sa
    Password: (leave empty)
}