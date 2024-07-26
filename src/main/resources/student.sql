-- Insert data into Student table
INSERT INTO Student (student_id, name, gpa, address_id) VALUES
                                                            (111, 'Dean', 3.5, 1),
                                                            (112, 'Zaineh', 3.8, 1),
                                                            (113, 'Yasmeen', 3.9, 2);

-- Insert data into Address table
INSERT INTO Address (address_id, city, state, zipcode) VALUES
                                                           (1, 'Fairfield', 'IA', 52556),
                                                           (2, 'Iowa City', 'IA', 52440),
                                                           (3, 'Morrison', 'IL', 61270);

-- Insert data into Course table
INSERT INTO Course (course_id, name) VALUES
                                         (545, 'Web Application Architecture'),
                                         (221, 'Data Structures'),
                                         (105, 'Problem Solving in CS'),
                                         (401, 'Modern Programming Practices');

-- Insert data into Student_Course table
INSERT INTO Student_Course (student_id, course_id) VALUES
                                                       (111, 545),
                                                       (111, 221),
                                                       (112, 545),
                                                       (112, 401),
                                                       (113, 221),
                                                       (113, 105),
                                                       (113, 401);

-- Insert data into Course_Details table
INSERT INTO Course_Details (description_id, course_description, credit, program, last_updated, course_id) VALUES
                                                                                                              (1, 'This course covers web …', 4, 'MSC', 2021, 545),
                                                                                                              (2, 'In this course, the fundamentals …', 4, 'BSC', 2020, 221),
                                                                                                              (3, 'This course focuses on teaching...', 4, 'BSC', 2018, 105),
                                                                                                              (4, 'This course covers the basic …', 4, 'MSC', 2016, 401);
