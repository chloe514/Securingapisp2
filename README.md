Securing APIs Project
This project enhances the security and networking aspects of a Spring Boot application by configuring HTTPS, implementing web security best practices, and integrating caching with Redis.

Features
HTTPS configuration on port 8443
Web security enhancements (CORS, CSRF protection, input validation)
Redis caching integration
Prerequisites
Java 17 or higher
Maven 3.6 or higher
Redis server running locally (default port 6379)
Getting Started
1. Clone the Repository
   bash
   
   git clone <https://github.com/chloe514/Securingapisp2>
   cd <C:\Users\chloe\Desktop\Securingapis2>
2. Configure SSL
   Ensure the SSL keystore is properly configured in src/main/resources and that the password and alias match those set in application.properties.

3. Run the Application
   bash
   ./mvnw spring-boot:run
4. Access the Application
   The application will run on HTTPS: https://localhost:8443
5. Test the APIs
   Use Postman or Curl to test the endpoints. For example, to test the greeting endpoint:

in bash
curl -k https://localhost:8443/greeting
The -k option is used to bypass SSL certificate verification since it's self-signed.

Security Configurations
HTTPS: Configured to secure the connection using SSL certificates.
CORS: Configured to allow specific origins.
CSRF: Enabled for state-changing requests.
Redis: Integrated for caching responses and reducing database load.
Troubleshooting
Ensure that your Redis server is up and running before starting the application.
Check the application.properties file for any incorrect paths or passwords for the keystore.
