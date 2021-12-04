# Spring Cloud Microservices

Description : Microservices Using Spring Boot and Spring Cloud.

<h3>Running the project</h3>

Docker :

- `ls` into the folder which contains the 'docker-compose.yml' file.
- Type the command `docker compose up -d`
- Type `docker compose ps` to see if it is up and running

PostgreSQL :

- Go to your browser and go to 'localhost:5050/browser' (port as found in the 'docker-compose.yml' file) to open pgAdmin. 
- Set the master password as 'password'.
- Create a new server.
  - In the form :
    - In the 'General' tab set the name as 'postgres'.
    - Go to 'Connection' tab and set the following properties (which can be cross-checked in the 'docker-compose.yml' file) :
      - Host name = postgres
      - Port = 5432
      - Maintenance database = postgres 
      - Username = seebaware
      - Password = password
      - Save password = True


