CREATE TABLE Username(id int not null auto_increment,username varchar(25) not null,primary key(id));
CREATE TABLE Create_Date_Time(id int not null auto_increment,create_Date_Time date not null,primary key(id));
CREATE TABLE Due_Date(id int not null auto_increment,Due_Date Date not null,primary key(id));
CREATE TABLE Estimate_Time(id int not null auto_increment,Estimate_Time time not null,primary key(id));
CREATE TABLE Text(id int not null auto_increment,status ENUM('DONE', 'CANCELLED', 'TODO'));