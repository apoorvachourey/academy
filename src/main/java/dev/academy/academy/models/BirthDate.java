package dev.academy.academy.models;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
@Getter
@Setter
@Entity
public class BirthDate extends BaseModel{
    private String date;
    @OneToMany(mappedBy = "dob")
    private List<User> users;
}
