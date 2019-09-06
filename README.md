# Spring MVC Hibernate - Sports Store (And Other)
##Description
This uses the "AngularJS-Sports-Store" repo and project therein to create and display 
an interactive list of Sports Products via a Web UI.

There are some random items in here that I was playing around with, such as methods named "updateGetCount()" 
in the ProductController and the Person classes, that can be ignored. However, feel free to test 
them yourself in the browser. 
##MySQL Docker Image and Setup
To get this project to work, download a Docker MySQL Image (version 5.6) locally and run the following commands in a bash terminal:
```
docker run -p 3306:3306 --name lukes-mysql-2 -e MYSQL_ROOT_PASSWORD=admin123 -d mysql:5.6
```
**NOTE**: "lukes-mysql-2" can be changed different name. Just remember your new name later. 
When starting the container, use the following command:
```
docker start <name_of_container>
```

The following commands can be entered to access the MySQL container and create the 'springmvc' database:
```
docker exec -it <name_of_container> bash -l
mysql -uroot -padmin123
#On MySQL console
CREATE DATABASE springmvc;
```

Don't worry about creating the tables as Hibernate is configured (in this project) to create them on startup and then
drop them on shutdown.

##IntelliJ and Tomcat
I was using **IntelliJ** for this project and so it is best to import this as a Maven project and 
configure a Tomcat Server (version 8+ - using 8.5.43 in this case) using this IDEA. The URL for the Tomcat
Server should be "http://localhost:8080/Lukes_SpringMVC_war_exploded/" when configured as this is where the AngularJS
app will ping the REST endpoints for data. 


