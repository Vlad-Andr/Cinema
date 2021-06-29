# Cinema application
This project represents itself as web based system, which can be used by opera theatres as an online service.Their clients can check schedule, buy tickets and reserve their seats for performance there.
This web-project represents cinema service. Application works with database and offers many demonstrative functionalities like: inserting and updating movie, movie session and order informations.

# Main functions:
Unauthorized user

  - registration
  - viewing all available sessions
  - viewing information about all cinema halls
  - searching session by date

User

  - booking ticket
  - adding a ticket to the shopping cart
  - viewing of all booked tickets in the shopping cart
  - making order
  - viewing history of all orders

Admin

  - adding / editing movies, cinema halls, movie sessions
  - search information about the user by e-mail

# Technologies that was used:
Spring (MVC, Security, Web)
Hibernate
Database: RDBMS MySQL
Web-server: Apache Tomcat
Project builder: Apache Maven

# Usage
Click on clone this project, open your IDE, then File -> New -> Project from Version Control -> paste project's URL -> Click clone.
Configure Tomcat Server(the best solution is to use Tomcat 9.0.46 or later version);
Configure MySQL RDBMS.
Open resources/db.properties file and change URL, Username and Password values to your own.(Hint: URL should be like - url: jdbc:mysql://(host name):(port)/(database name)?serverTimezone=UTC)
Run an application.


http://localhost:8080/health/ - application health checks
http://localhost:8080/movies/admin/seed - Seed the database with sample data
http://localhost:8080/movies/ - List the movies in the catalog
http://localhost:8080/swagger-ui.html - View the Swagger API documentation
