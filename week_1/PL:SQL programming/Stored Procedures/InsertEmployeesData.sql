INSERT INTO Employees VALUES (1,'Alice','Manager',70000,'HR',TO_DATE('2015-06-15','YYYY-MM-DD'));
INSERT INTO Employees VALUES (2,'Bob','Developer',60000,'IT',TO_DATE('2017-03-20','YYYY-MM-DD'));
INSERT INTO Employees VALUES (3,'Charlie','Developer',65000,'IT',TO_DATE('2018-04-12','YYYY-MM-DD'));
INSERT INTO Employees VALUES (4,'David','Analyst',55000,'Finance',TO_DATE('2019-05-18','YYYY-MM-DD'));
INSERT INTO Employees VALUES (5,'Eva','Executive',50000,'Sales',TO_DATE('2020-01-10','YYYY-MM-DD'));

INSERT INTO Employees VALUES (6,'Frank','Manager',80000,'IT',TO_DATE('2014-08-11','YYYY-MM-DD'));
INSERT INTO Employees VALUES (7,'Grace','Analyst',52000,'Finance',TO_DATE('2021-02-14','YYYY-MM-DD'));
INSERT INTO Employees VALUES (8,'Helen','Executive',48000,'Marketing',TO_DATE('2022-03-15','YYYY-MM-DD'));
INSERT INTO Employees VALUES (9,'Ian','Developer',62000,'IT',TO_DATE('2018-09-20','YYYY-MM-DD'));
INSERT INTO Employees VALUES (10,'Jack','Manager',75000,'Sales',TO_DATE('2016-07-07','YYYY-MM-DD'));

INSERT INTO Employees VALUES (11,'Kevin','Developer',58000,'IT',TO_DATE('2020-10-05','YYYY-MM-DD'));
INSERT INTO Employees VALUES (12,'Laura','HR Executive',51000,'HR',TO_DATE('2019-11-11','YYYY-MM-DD'));
INSERT INTO Employees VALUES (13,'Mike','Analyst',56000,'Finance',TO_DATE('2017-12-01','YYYY-MM-DD'));
INSERT INTO Employees VALUES (14,'Nina','Executive',49000,'Marketing',TO_DATE('2021-01-19','YYYY-MM-DD'));
INSERT INTO Employees VALUES (15,'Oscar','Developer',64000,'IT',TO_DATE('2018-06-30','YYYY-MM-DD'));

INSERT INTO Employees VALUES (16,'Peter','Manager',82000,'Finance',TO_DATE('2013-05-05','YYYY-MM-DD'));
INSERT INTO Employees VALUES (17,'Queen','Executive',47000,'Sales',TO_DATE('2022-08-08','YYYY-MM-DD'));
INSERT INTO Employees VALUES (18,'Ryan','Developer',61000,'IT',TO_DATE('2019-04-09','YYYY-MM-DD'));
INSERT INTO Employees VALUES (19,'Sophia','HR Executive',53000,'HR',TO_DATE('2020-12-12','YYYY-MM-DD'));
INSERT INTO Employees VALUES (20,'Tom','Analyst',54000,'Finance',TO_DATE('2021-09-15','YYYY-MM-DD'));

INSERT INTO Employees VALUES (21,'Uma','Executive',46000,'Marketing',TO_DATE('2022-10-10','YYYY-MM-DD'));
INSERT INTO Employees VALUES (22,'Victor','Developer',67000,'IT',TO_DATE('2016-11-11','YYYY-MM-DD'));
INSERT INTO Employees VALUES (23,'Wendy','Manager',78000,'HR',TO_DATE('2015-01-01','YYYY-MM-DD'));
INSERT INTO Employees VALUES (24,'Xavier','Executive',52000,'Sales',TO_DATE('2021-07-07','YYYY-MM-DD'));
INSERT INTO Employees VALUES (25,'Yash','Developer',63000,'IT',TO_DATE('2018-02-02','YYYY-MM-DD'));

COMMIT;

select COUNT(*) FROM Employees; --should return 25 rows