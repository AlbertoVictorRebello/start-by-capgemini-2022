
<div>
  <img src="./.img/fotoCapa.jpg" alt="Start By Capgemini" width="100%" align-self="center" margin="0px"> 
</div>

# Presentation
This project was developed as part of the bootcamp ["Start By Capgemini"](http://capgeminischool.brazilsouth.cloudapp.azure.com/login/index.php). 
 
You are invited to use the codes and improve them. It will be great if you have comments or suggestions to make them better. 

## Tecnologies And Tools
<div>
<img src="https://img.shields.io/static/v1?label=&message=JAVA&color=blue">
<img src="https://img.shields.io/static/v1?label=&message=SQL&color=orange">
<img src="https://img.shields.io/static/v1?label=&message=GIT&color=blueviolet">
<img src="https://img.shields.io/static/v1?label=&message=MySQL &color=yellowgreen">
<img src="https://img.shields.io/static/v1?label=&message=GITHUB&color=orange">
<img src="https://img.shields.io/static/v1?label=&message=XAMPP&color=blue">
<img src="https://img.shields.io/static/v1?label=&message=APACHE NETBEANS IDE&color=blue">
</div>


## Project Specification
Main objective: this system will provide the resources to manage a set of projects and their activities.



| Topic | Description                                                                                                                                                                                                                                    |
| -------- |------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|Entities||
|Project|- Name|
||- Description|
||- Created Date|
||- Updated Date|
|Activities||
||- Name|
||- Description|
||- Status|
||- Comments|
||- Time Period|
||- Created Date|
||- Updated Date|

## Development steps
The following steps guided the development process:
| Task | Description                                                                                                                                                                                                                                    |
| -------- |------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|Database|It was created a MySQL database named as projectMonitor using XAMPP.|
|ORM|The java classes project and task were created to abstract the database entities.|
|DB connection| The connection with MySQL is made including a dependncy entry at settings.gradle file and the ConnectionFactory java class created into util package|
|Controller classes|The CRUD operations are implemented on two dedicated controllers, one in charge of the projects and other for the tasks.|
|UI| The application has three screens: a main screen presenting the projects and theirs tasks, a dialog screen to include new projects and another one to include new tasks for a specific project.|
||Main screen: implemented to present the projects, their tasks, commands to include new projects, new tasks, edit their tasks or remove them.|
||Main screen: CellRenderer deadline: thi field is colored as red to delayed tasks, green to up to date ones and gray to mark that they are completed.|
||Main screen: CellRenderer edit and delete: the tasks table list has a icon for edition and one for deletion operation.|
||Project input screen: implemented a dialog screen to project insertion operations.|
||Task input screen: implemented a dialog screen to task insertion operations.|
|Events| The event listeners were used to update the UI after data manipulation commands.|
|Finalization|Chalenge 1: to permit the project delition. It was implemented. |
||Chalenge 2: to permit the task edition. It was implemented. |
|Tests| The tests were successfuly executed to validate the system operation.|
## Usage Instructions
1- Open the Projects Monitor System.
2- Click the Projects' plus icon to include a new project.
3- Click the Tasks' plus icon to include a new task.
4- Click the completed field to finish a task.
5- Click the pencil's icon to edit a task.
6- Click the red X's icon to remove a task.
7- Select a project and press delete to remove a project with its tasks.

