-- DDL
create table person
(
    id int unsigned auto_increment primary key,
    name varchar(50) not null,
    surname varchar(50) not null,
    gender varchar(50) not null
);

create table study_program
(
    id int unsigned auto_increment primary key,
    title varchar(50) not null unique
);

create table student
(
    id int unsigned auto_increment primary key,
    study_type varchar(50) not null,
    date_started DATE not null,
    person_id int unsigned not null,
    study_program_id int unsigned not null,
    FOREIGN KEY (person_id) REFERENCES person(id),
    FOREIGN KEY (study_program_id) REFERENCES study_program(id)
);

create table lecturer
(
    id int unsigned auto_increment primary key,
    level varchar(50) not null,
    salary DECIMAL(8, 2) not null,
    person_id int unsigned not null,
    FOREIGN KEY (person_id) REFERENCES person(id)
);

create table module
(
    id int unsigned auto_increment primary key,
    title varchar(50) not null unique,
    lecturer_id int unsigned not null,
    FOREIGN KEY (lecturer_id) REFERENCES lecturer(id)
);

create table study_program_module
(
    study_program_id int unsigned not null,
    module_id int unsigned not null,
    FOREIGN KEY (study_program_id) REFERENCES study_program(id),
    FOREIGN KEY (module_id) REFERENCES module(id),
    UNIQUE(study_program_id, module_id)
);

CREATE TABLE exam_type
(
    id    INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(250) NOT NULL,
    module_id    INT UNSIGNED NOT NULL,
    FOREIGN KEY (module_id) REFERENCES module (id)
);

CREATE TABLE exam
(
    id           INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    grade        TINYINT UNSIGNED NOT NULL CONSTRAINT grade_range CHECK (grade BETWEEN 1 AND 10),
    exam_type_id INT UNSIGNED NOT NULL,
    student_id   INT UNSIGNED NOT NULL,
    FOREIGN KEY (exam_type_id) REFERENCES exam_type (id),
    FOREIGN KEY (student_id) REFERENCES student (id)
);
