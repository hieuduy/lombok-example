package hdd.example.entity;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hieudang on 9/14/2016.
 */
@Builder @Getter @Setter
@EqualsAndHashCode (of = {"name", "age", "address"})
@ToString (exclude = "subjects")
public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private double grade;
    private List<Object> subjects;

    public List<Object> getSubjects() {
        if (subjects == null) {
            return new ArrayList<Object>();
        }
        return subjects;
    }
}
