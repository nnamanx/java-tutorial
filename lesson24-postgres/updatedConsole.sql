create
    database task2; -- Database homework2

\C task2;

create schema public;


create table teacher_row_info
(
    id          serial primary key,
    create_date date,
    update_date date,
    status      int
);

create table student_row_info
(
    id          serial primary key,
    create_date date,
    update_date date,
    status      int
);

create table teacher
(
    id                  serial primary key,
    name                varchar,
    surname             varchar,
    profession          varchar,
    salary              double precision,
    start_date          timestamp,
    end_date            timestamp,
    teacher_row_info_id int,

    foreign key (teacher_row_info_id) references teacher_row_info
);

create table student
(
    id                  serial primary key,
    name                varchar,
    surname             varchar,
    major               varchar,
    fee                 double precision,
    start_date          timestamp,
    end_date            timestamp,
    teacher_id          int,
    student_row_info_id int,

    foreign key (teacher_id) references teacher,
    foreign key (student_row_info_id) references student_row_info
);

create table employee_row_info
(
    id          serial primary key,
    create_date date,
    update_date date,
    status      int
);

create table employee
(
    id                   serial primary key,
    name                 varchar,
    surname              varchar,
    position             varchar,
    salary               double precision,
    start_date           timestamp,
    end_date             timestamp,
    employee_row_info_id int,

    foreign key (employee_row_info_id) references employee_row_info
);

--Inserting teacher
INSERT INTO teacher_row_info (create_date, update_date, status)
VALUES (now(), now(), 1);

INSERT INTO teacher (name, surname, profession, salary, start_date, end_date, teacher_row_info_id)
VALUES ('Farid', 'Tahmazov', 'Backend developer', 99999, null, null,
        (select id from teacher_row_info order by id desc limit 1));


--Inserting student
INSERT INTO student_row_info(create_date, update_date, status)
VALUES (now(), now(), 1);

INSERT INTO student (name, surname, major, fee, start_date, end_date, teacher_id, student_row_info_id)
VALUES ('Laman', 'Khudadatzada', 'Backend developer', 400, null, null,
        (select id from teacher order by id desc limit 1),
        (select id from student_row_info order by id desc limit 1));

INSERT INTO student (name, surname, major, fee, start_date, end_date, teacher_id, student_row_info_id)
VALUES ('Nazrin', 'Babazada', 'Frontend developer', 400, '2022-11-11', null,
        (select id from teacher order by id desc limit 1),
        (select id from student_row_info order by id desc limit 1) );

INSERT INTO student (name, surname, major, fee, start_date, end_date, teacher_id, student_row_info_id)
VALUES ('Azar', 'Guliyev', 'Frontend developer', 400, '2022-11-11', null,
        (select id from teacher order by id desc limit 1),
        (select id from student_row_info order by id desc limit 1) );


--Inserting employee
INSERT INTO employee_row_info(create_date, update_date, status)
VALUES (now(), now(), 1);

INSERT INTO employee (name, surname, position, salary, start_date, end_date, employee_row_info_id)
VALUES ('Leyla', 'Mammadova', 'Resecptionist', 1000, null, null,
        (select id from employee_row_info order by id desc limit 1));


--Altering types of star and end dates
ALTER TABLE teacher
    ALTER
        COLUMN start_date TYPE date;

ALTER TABLE teacher
    ALTER
        COLUMN end_date TYPE date;

ALTER TABLE teacher_row_info
    ALTER
        COLUMN create_date TYPE timestamp;

ALTER TABLE teacher_row_info
    ALTER
        COLUMN update_date TYPE timestamp;

ALTER TABLE student
    ALTER
        COLUMN start_date TYPE date;

ALTER TABLE student
    ALTER
        COLUMN end_date TYPE date;

ALTER TABLE student_row_info
    ALTER
        COLUMN create_date TYPE timestamp;

ALTER TABLE student_row_info
    ALTER
        COLUMN update_date TYPE timestamp;



ALTER TABLE employee
    ALTER
        COLUMN start_date TYPE date;

ALTER TABLE employee
    ALTER
        COLUMN end_date TYPE date;

ALTER TABLE employee_row_info
    ALTER
        COLUMN create_date TYPE timestamp;

ALTER TABLE employee_row_info
    ALTER
        COLUMN update_date TYPE timestamp;
--end of altering types of dates


--Setting values to start dates
UPDATE teacher
SET start_date = '2022-11-11'
WHERE id = 1;

UPDATE student
SET start_date = '2022-11-11'
WHERE name = 'Laman';

UPDATE employee
SET start_date = '2020-9-10'
WHERE id = 1;
--end of setting values to start dates


DELETE
FROM teacher_row_info
WHERE status = 1;


--showing student info
SELECT *
FROM student
         INNER JOIN teacher teacher ON student.teacher_id = teacher.id;

SELECT teacher.name, teacher.surname
FROM teacher
         INNER JOIN student ON teacher.id = student.teacher_id;

SELECT *
FROM teacher
CROSS JOIN student;



