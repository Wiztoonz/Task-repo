USE University;

SELECT student.id, student.first_name, student.last_name, marks.mark, university_group.name AS group_name FROM student 
	INNER JOIN university_course ON student.id = university_course.student_id 
	INNER JOIN marks ON marks.university_course_id = university_course.id 
	INNER JOIN university_group ON university_group.id = student.id_group WHERE mark > 4;

