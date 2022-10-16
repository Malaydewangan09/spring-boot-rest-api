
## Dive into the project
Download or clone this project, import this to your favourite IDE and run. This project will run on default spring boot port on **localhost** is **8080**. I have implemented 5 end points for serving the purpose of CRUD operations. The end points are : <br/>

HTTP Operation | End Points | Purpose
------------ | ------------- | --------------
POST | http://localhost:8080/user | Save USER
GET | http://localhost:8080/user/{id} | Fetch USER using ID
GET | http://localhost:8080/user | Fetch all USERS
GET | http://localhost:8080/email/count?user={userid} | GET NUMBER OF EMAIL BY A USER
POST | http://localhost:8080/email | CREATE EMAIL

After starting the project on port 8080, first need to login the H2 Database using the `http://localhost:8080/h2-console/` url. just insert the password that is set in application.properties. <br/>





