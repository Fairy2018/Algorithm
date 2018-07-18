Student
Teacher
Subjects
How many students are studying a subject at Grade 3?
How many subjects does a specific student (e.g. lijin) take?
Who teaches Grade 3 Math?
Which subjects are offered in Grade 3?
How many distinct teachers are teaching Grade 3?
How many distinct teachers does a student (lijin) have?

设计几个表 然后写出sql命令回答上面的问题

①思路
student-subjects->n:n;   建中间表
student-teacher->n:n;    建中间表
teacher-subject->n:1;    外键

②设计的表
Students[学生]
pk:stu_id  stu_name  gra_id

Teachers[老师]
pk:tea_id  tea_name  fk:sub_id  gra_id

Subjects[科目]
pk:sub_id  sub_name  gra_id

stu_sub[学生-科目]
pk:ss_id  stu_id  sub_id

stu_tea[学生-老师]
pk:st_id  stu_id  tea_id

③回答问题
1.How many students are studying a subject at Grade 3?
SELECT COUNT(stu_id) FROM Students
WHERE gra_id=3 AND COUNT(
    select stu_id from stu_sub
    inner join Students on Students.stu_id=stu_sub.stu_id )=1;

2.How many subjects does a specific student (e.g. lijin) take?
SELECT COUNT(sub_id) FROM stu_sub
INNER JOIN Students on stu_sub.id=Students.stu_id 
WHERE Students.stu_name='lijin';

3.Who teaches Grade 3 Math?
SELECT tea_name FROM Teachers
INNER JOIN Subjects on Teachers.sub_id=Subjects.sub_id
WHERE Subjects.sub_name='Math' AND Subjects.gra_id=3;

4.Which subjects are offered in Grade 3?
SELECT sub_name FROM Subjects
WHERE gra_id=3 ;

5.How many distinct teachers are teaching Grade 3?
SELECT COUNT(tea_id) FROM Teachers
WHERE gra_id=3;

6.How many distinct teachers does a student (lijin) have?
SELECT COUNT(tea_id) FROM stu_tea 
INNER JOIN Students on Student.stu_id=stu_tea.stu_id
WHERE Students.stu_name='lijin';
