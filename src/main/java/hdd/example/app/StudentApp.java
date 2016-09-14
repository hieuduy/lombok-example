package hdd.example.app;

import hdd.example.entity.Course;
import hdd.example.entity.Student;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created by hieudang on 9/14/2016.
 */
@Slf4j
public class StudentApp {
    public static void main(String[] args) {
        log.info("System is startup");

        Student student = Student.builder()
                                .id(0471)
                                .name("Hieu Dang")
                                .age(33)
                                .grade(100)
                                .address("123 Cong Hoa").build();

        log.info(student.toString());

        Course course = new Course(001, "Lombok-Java");
        course.setStudents(Arrays.asList(student));

        log.info(course.toString());
    }
}
