# Custom OpenAPI generator
## Description
Custom OpenAPI is an application that utilize OpenAPI code generator to create a custom API using mustache templates
## Features
- Custom API generator which generates API, classes, models and test APIs
- LibGdx sample project that creates a sample project project compatible with Desktop, Android and Web

## Usage:
- clone the openapi-libgdx-generator repo
- change to the directory of the repo: cd openapi-libgdx-generator
- create a gradlew function with the command: gradle wrapper
- generate your API code with the command: ./gradlew generateClient
- change to the libgdx-sample directory: cd libgdx-sample
- create a gradlew function with the command: gradle wrapper
- Run the commands for testing the sample project on various platforms: desktop - ./gradlew lwjgl3:run, android - ./gradlew android:run, html - ./gradlew html:dist, web - ./gradlew html:superDev
