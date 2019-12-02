SELECT student.id, student.first_name, student.last_name, course.course_title, marks.mark 
	FROM student
	 INNER JOIN university_course ON student.id = university_course.student_id 
	 INNER JOIN course ON course.id = university_course.course_id 
	 INNER JOIN marks ON marks.university_course_id = university_course.id 
	  WHERE course.course_title = 'Programming' AND marks.mark > 4 ORDER BY student.first_name;

