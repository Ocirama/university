-- DML
insert into person (name, surname, gender) values ('Rutenis', 'Turcinas', 'male');
insert into lecturer (level, salary, person_id) values ('lecturer', 99.99, (select max(id) from person));
insert into person (name, surname, gender) values ('Gintaras', 'Kazlauskas', 'male');
insert into lecturer (level, salary, person_id) values ('lecturer', 102.14, (select max(id) from person));
insert into person (name, surname, gender) values ('Tomas', 'Norkus', 'male');
insert into lecturer (level, salary, person_id) values ('lecturer', 199, (select max(id) from person));
insert into person (name, surname, gender) values ('Paulius', 'Stabingis', 'male');
insert into lecturer (level, salary, person_id) values ('lecturer', 185.2, (select max(id) from person));

insert into study_program (title) VALUES ('Java nuo pagrindų');
insert into module (title, lecturer_id) values ('Java - Fundamentals', (select lecturer.id from lecturer inner join person p on lecturer.person_id = p.id where p.name='Gintaras'));
insert into study_program_module (study_program_id, module_id) VALUES ((select id from study_program where title = 'Java nuo pagrindų'), (select id from module where title = 'Java - Fundamentals'));
insert into module (title, lecturer_id) values ('Java - Fundamentals: Coding', (select lecturer.id from lecturer inner join person p on lecturer.person_id = p.id where p.name='Gintaras'));
insert into study_program_module (study_program_id, module_id) VALUES ((select id from study_program where title = 'Java nuo pagrindų'), (select id from module where title = 'Java - Fundamentals: Coding'));
insert into module (title, lecturer_id) values ('Software Testing - Fundamentals', (select lecturer.id from lecturer inner join person p on lecturer.person_id = p.id where p.name='Gintaras'));
insert into study_program_module (study_program_id, module_id) VALUES ((select id from study_program where title = 'Java nuo pagrindų'), (select id from module where title = 'Software Testing - Fundamentals'));
insert into module (title, lecturer_id) values ('Java - Advanced Features', (select lecturer.id from lecturer inner join person p on lecturer.person_id = p.id where p.name='Rutenis'));
insert into study_program_module (study_program_id, module_id) VALUES ((select id from study_program where title = 'Java nuo pagrindų'), (select id from module where title = 'Java - Advanced Features'));
insert into module (title, lecturer_id) values ('Design Patterns & Good Practices', (select lecturer.id from lecturer inner join person p on lecturer.person_id = p.id where p.name='Rutenis'));
insert into study_program_module (study_program_id, module_id) VALUES ((select id from study_program where title = 'Java nuo pagrindų'), (select id from module where title = 'Design Patterns & Good Practices'));
insert into module (title, lecturer_id) values ('Java - Advanced Features: Coding', (select lecturer.id from lecturer inner join person p on lecturer.person_id = p.id where p.name='Rutenis'));
insert into study_program_module (study_program_id, module_id) VALUES ((select id from study_program where title = 'Java nuo pagrindų'), (select id from module where title = 'Java - Advanced Features: Coding'));
insert into module (title, lecturer_id) values ('Databases - SQL', (select lecturer.id from lecturer inner join person p on lecturer.person_id = p.id where p.name='Rutenis'));
insert into study_program_module (study_program_id, module_id) VALUES ((select id from study_program where title = 'Java nuo pagrindų'), (select id from module where title = 'Databases - SQL'));
insert into module (title, lecturer_id) values ('JDBC & Hibernate', (select lecturer.id from lecturer inner join person p on lecturer.person_id = p.id where p.name='Rutenis'));
insert into study_program_module (study_program_id, module_id) VALUES ((select id from study_program where title = 'Java nuo pagrindų'), (select id from module where title = 'JDBC & Hibernate'));

insert into study_program (title) VALUES ('Sourcery for Developers');
insert into study_program_module (study_program_id, module_id) VALUES ((select id from study_program where title = 'Sourcery for Developers'), (select id from module where title = 'Java - Advanced Features'));
insert into module (title, lecturer_id) values ('Spring Framework', (select lecturer.id from lecturer inner join person p on lecturer.person_id = p.id where p.name='Tomas'));
insert into study_program_module (study_program_id, module_id) VALUES ((select id from study_program where title = 'Sourcery for Developers'), (select id from module where title = 'Spring Framework'));
insert into module (title, lecturer_id) values ('J2EE', (select lecturer.id from lecturer inner join person p on lecturer.person_id = p.id where p.name='Tomas'));
insert into study_program_module (study_program_id, module_id) VALUES ((select id from study_program where title = 'Sourcery for Developers'), (select id from module where title = 'J2EE'));
insert into module (title, lecturer_id) values ('JavaScript', (select lecturer.id from lecturer inner join person p on lecturer.person_id = p.id where p.name='Paulius'));
insert into study_program_module (study_program_id, module_id) VALUES ((select id from study_program where title = 'Sourcery for Developers'), (select id from module where title = 'JavaScript'));
insert into module (title, lecturer_id) values ('ReactJS', (select lecturer.id from lecturer inner join person p on lecturer.person_id = p.id where p.name='Paulius'));
insert into study_program_module (study_program_id, module_id) VALUES ((select id from study_program where title = 'Sourcery for Developers'), (select id from module where title = 'ReactJS'));

insert into study_program (title) VALUES ('Sourcery for Kids');

insert into person (name, surname, gender) values ('Violeta', 'Baneliene', 'female');
insert into student (study_type, date_started, person_id, study_program_id) values ('vakarines', '2019-08-06', (select max(id) from person), (select id from study_program where title = 'Java nuo pagrindų'));
insert into person (name, surname, gender) values ('Simonas', 'Penkinas', 'male');
insert into student (study_type, date_started, person_id, study_program_id) values ('vakarines', '2019-08-06', (select max(id) from person), (select id from study_program where title = 'Java nuo pagrindų'));
insert into person (name, surname, gender) values ('Justina', 'Varnaite', 'female');
insert into student (study_type, date_started, person_id, study_program_id) values ('vakarines', '2019-08-06', (select max(id) from person), (select id from study_program where title = 'Java nuo pagrindų'));
insert into person (name, surname, gender) values ('Vaida', 'Kameneckiene', 'female');
insert into student (study_type, date_started, person_id, study_program_id) values ('vakarines', '2019-08-06', (select max(id) from person), (select id from study_program where title = 'Java nuo pagrindų'));
insert into person (name, surname, gender) values ('Valdemaras', 'Tauras', 'male');
insert into student (study_type, date_started, person_id, study_program_id) values ('vakarines', '2019-08-06', (select max(id) from person), (select id from study_program where title = 'Java nuo pagrindų'));
insert into person (name, surname, gender) values ('Brigita', 'Sliauzyte', 'female');
insert into student (study_type, date_started, person_id, study_program_id) values ('vakarines', '2019-08-06', (select max(id) from person), (select id from study_program where title = 'Java nuo pagrindų'));
insert into person (name, surname, gender) values ('Justinas', 'Pedisius', 'male');
insert into student (study_type, date_started, person_id, study_program_id) values ('vakarines', '2019-08-06', (select max(id) from person), (select id from study_program where title = 'Java nuo pagrindų'));

insert into person (name, surname, gender) values ('Kestutis', 'Valasinas', 'male');
insert into student (study_type, date_started, person_id, study_program_id) values ('dienines', '2017-10-04', (select max(id) from person), (select id from study_program where title = 'Sourcery for Developers'));
insert into person (name, surname, gender) values ('Konstantinas', 'Buivydas', 'male');
insert into student (study_type, date_started, person_id, study_program_id) values ('dienines', '2017-10-04', (select max(id) from person), (select id from study_program where title = 'Sourcery for Developers'));
insert into person (name, surname, gender) values ('Tautvydas', 'Eimutis', 'male');
insert into student (study_type, date_started, person_id, study_program_id) values ('dienines', '2016-10-06', (select max(id) from person), (select id from study_program where title = 'Sourcery for Developers'));
