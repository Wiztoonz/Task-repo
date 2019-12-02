USE University;
DELIMITER ;;
DROP PROCEDURE IF EXISTS showTeacher;
CREATE PROCEDURE showTeacher(length INT)
BEGIN
  DECLARE i INT;
  SET i = 0;
  WHILE i < length DO
  	SELECT * FROM teacher WHERE id = (SELECT course_id FROM university_course WHERE (course_id = i) limit 1) 
		      AND (SELECT COUNT(course_id) FROM university_course WHERE course_id = i) > 7; -- Учатся больше 2000 студентов.
    SET i = i + 1;
  END WHILE;
END;;
DELIMITER ;

DECLARE @courses INT DEFAULT 0;
SELECT COUNT(*) INTO @courses FROM course;

CALL showTeacher(@courses);

-- В тестовых данных наибольшое коль-во студентов (  > 7  )
