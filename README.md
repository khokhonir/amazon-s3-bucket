#Spring Boot Amazon S3 Bucket API

### 1. Introduction
Amazon S3 is one of the services from [Amazon Web Services](https://aws.amazon.com/), which provides object storage service that stores data as objects in buckets. In this project we will upload files to the S3 bucket using an API.


### 2. Architecture
![img_2.png](img_2.png)

### 3. Setup

### 3.1 AWS Setup

- Setup the billing alert 
![img_3.png](img_3.png)

- Create an IAM user. The credentials for this user will be used  to access the S3 bucket 
![img_4.png](img_4.png)
  
- Create the S3 bucket 
![img_5.png](img_5.png)

-Setup the S3 bucket permission
![img_7.png](img_7.png)

![img_8.png](img_8.png)


### 3.2 API SETUP

### 3.2.1 Prerequisites
   - Java 8+
   - Maven 3+
   - AWS Free Account
   - Root and I am AWS Credentials and Region 
   - S3 Bucket
   - IDE 

### 3.2.2 Dependencies
   - Spring Web
   - Spring Dev Tools
   - AWS Java SDK
   - Lombok

### 3.2.3 Build and Run the API locally

Run the command below in the terminal
- mvn clean install
- java -jar -Dspring.profiles.active=local target/<jar-name>
  

### 3.2.4 Upload the file using Postmanarget/<jarFileName>.jar
![img.png](img.png)

### 3.2.5 Check the file in AWS

![img_1.png](img_1.png)


### 4.  Reference
https://momentummetropolitan.udemy.com/course/introduction-to-cloud-computing-on-amazon-aws-for-beginners/learn/lecture/34499922#overview

### Thank you