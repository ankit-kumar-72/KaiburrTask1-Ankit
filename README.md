KaiburrTask1-Ankit
Task 1: Java REST API Example

This project serves as an example of a Java-based REST API using the following technologies:

    Java
    Maven
    SpringBoot
    MongoDB

REST API Endpoints
Add Server

Endpoint: http://127.0.0.1:2017/addServer

Method: PUT

Description: Add a new "server" object in JSON format.
Get Servers

Endpoint: http://127.0.0.1:2017/getServers

Method: GET

Description: Returns a list of "server" objects.
Get Server by ID

Endpoint: http://127.0.0.1:2017/getServers/{id}

Method: GET

Description: Returns a "server" object matching the given ID.
Get Servers by Name

Endpoint: http://127.0.0.1:2017/getServer/{name}

Method: GET

Description: Returns a list of "server" objects matching the given name.
Delete Server by ID

Endpoint: http://127.0.0.1:2017/deleteServer/{id}

Method: DELETE

Description: Deletes a "server" object matching the given ID.
Setup Instructions

    Clone the repository:
    
git clone https://github.com/your-username/KaiburrTask1-Ankit.git
cd KaiburrTask1-Ankit

    Build and run the application:

mvn spring-boot:run

    Access the API at http://127.0.0.1:2017.

Dependencies

    Java 8
    Maven
    Spring Boot
    MongoDB

Contributing

If you'd like to contribute, please follow these steps:

    Fork the repository.
    Create a new branch for your feature or bug fix.
    Make your changes and submit a pull request.
