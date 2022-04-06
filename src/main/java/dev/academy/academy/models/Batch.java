package dev.academy.academy.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Batch extends BaseModel {
    String name;
    @ManyToMany
    List<Student> students;
}
