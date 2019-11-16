DROP DATABASE IF EXISTS University;

CREATE DATABASE University;

USE University;

CREATE TABLE teacher(
	id INT AUTO_INCREMENT,
	first_name VARCHAR(25) NOT NULL,
	last_name VARCHAR(25) NOT NULL,
	email VARCHAR(255) UNIQUE NOT NULL,
	PRIMARY KEY(id)
	);

CREATE TABLE course(
	id INT AUTO_INCREMENT,
	course_title VARCHAR(50) NOT NULL,
	teacher_id INT NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (teacher_id) REFERENCES teacher(id)
	);

CREATE TABLE university_group(
	id INT AUTO_INCREMENT,
	name VARCHAR(255) NOT NULL,
	PRIMARY KEY(id)
	);

CREATE TABLE student(
	id INT AUTO_INCREMENT,
	first_name VARCHAR(25) NOT NULL,
	last_name VARCHAR(25) NOT NULL,
	id_group INT NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (id_group) REFERENCES university_group(id)
	);

CREATE TABLE university_course(
	id INT AUTO_INCREMENT,
	course_id INT NOT NULL,
	student_id INT NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (course_id) REFERENCES course(id),
	FOREIGN KEY (student_id) REFERENCES student(id)
	);

CREATE TABLE marks(
	id INT AUTO_INCREMENT,
	university_course_id INT NOT NULL,
	mark INT NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (university_course_id) REFERENCES university_course(id)
	);

	
	
