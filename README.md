![image](https://github.com/user-attachments/assets/ff6cb21f-1b2e-47fc-b006-046369807e57)



# AWS-CICD: Spring Boot Course Management API

This project is a Spring Boot application for managing courses. It leverages AWS CodeBuild and CodePipeline to automate the CI/CD process and deploys the application to Amazon ECS Fargate.

---

## Features

The application provides the following RESTful APIs for course management:

1. **Get Course**: Fetch details of a course by its ID.  
   - **Endpoint**: `GET /courses/{courseId}`  

2. **Create Course**: Add a new course to the system.  
   - **Endpoint**: `POST /courses`  
   - **Payload**:  
     {
       "courseId": "101",
       "courseName": "Spring Boot Basics",
       "coursePrice": 499.99
     }
     ```

3. **Update Course**: Update details of an existing course by ID.  
   - **Endpoint**: `PUT /courses/{courseId}`  
   - **Payload**:  
     ```json
     {
       "courseName": "Spring Boot Advanced",
       "coursePrice": 599.99
     }
     ```

4. **Delete Course**: Delete a course by its ID.  
   - **Endpoint**: `DELETE /courses/{courseId}`  

---

## Tech Stack

- **Java 17**  
- **Spring Boot 3.1**  
- **Docker**  
- **AWS CodeBuild**  
- **AWS CodePipeline**  
- **Amazon ECS Fargate**  

---

## Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/your-repo/aws-cicd.git
cd aws-cicd
```

### 2. Configure AWS Infrastructure
- Set up an **ECS Fargate Cluster** and define a service.
- Configure **AWS CodePipeline** with your Git repository.
- Add a **CodeBuild** project to build and containerize the Spring Boot application.

### 3. Run Locally (Optional)
To run the application locally using Docker:
```bash
mvn clean package
docker build -t aws-cicd:latest .
docker run -p 8080:8080 aws-cicd:latest
```

### 4. Automate Deployment
Push your code changes to the Git repository. **AWS CodePipeline** will:
1. Pull the latest code.
2. Build the project with **CodeBuild**.
3. Deploy the container to **ECS Fargate**.

---

## CI/CD Pipeline Overview

1. **CodePipeline**: Manages the CI/CD workflow.  
2. **CodeBuild**: Builds the application and creates the Docker container image.  
3. **ECS Fargate**: Runs the containerized application in a serverless environment.  

---

## Testing the APIs

You can test the APIs using tools like **Postman** or **cURL**.

### Example API Calls:

**Get a Course**  
```bash
curl -X GET http://localhost:8080/courses/101
```

**Create a Course**  
```bash
curl -X POST http://localhost:8080/courses \
-H "Content-Type: application/json" \
-d '{
    "courseId": "101",
    "courseName": "Spring Boot Basics",
    "coursePrice": 499.99
}'
```

---

## Contributing

1. Fork this repository.  
2. Create a new branch: `git checkout -b feature/your-feature-name`.  
3. Commit your changes: `git commit -m "Add your feature"`.  
4. Push to the branch: `git push origin feature/your-feature-name`.  
5. Open a pull request.

---

## License

This project is licensed under the [MIT License](LICENSE).

---

You can directly copy and use this README file for your project! Let me know if you need any adjustments.

