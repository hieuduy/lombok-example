package hdd.example.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hieudang on 9/14/2016.
 */
@Getter @Setter
@RequiredArgsConstructor
@EqualsAndHashCode (exclude = "students")
public class Course {
    private final int id;
    private final String name;
    private List<Student> students;

    public List<Student> getStudents() {
        if (students == null) {
            return new ArrayList<Student>();
        }
        return students;
    }

    @Override
    public String toString() {
        return new String(String.format("Course(id=%d, name=%s, number-of-student=%d)",
                                            this.id, this.name, getStudents().size()));
    }
}
