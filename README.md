Overview
This project contains the code to generate a REST API using OpenAPI 3.0 specification and Gradle as the build tool.

Project Structure
.
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── ss
│   │   │           └── openapi
│   │   │               └── YourApiApplication.java
│   │   ├── resources
│   │   │   └── application.yml
│   └── test
│       ├── java
│       └── resources
├── build.gradle
└── README.md

Prerequisites
JDK 21 or higher
Gradle 6.0 or higher


OpenAPI 3.0 Specification
The OpenAPI 3.0 specification is used to define the REST API endpoints, request/response models, and other details. The specification file is located at src/main/resources/application.yml.

Generating REST API Code
To generate REST API code using OpenAPI 3.0, follow these steps:

Define the OpenAPI specification:

Create an OpenAPI specification file in src/main/resources directory (e.g., openapi.yml).
