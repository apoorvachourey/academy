package dev.academy.academy.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Getter
@Setter
@Entity(name="users")
public class User extends BaseModel{
   private String name;
   private String email;
   private String password;
   @ManyToOne
   private BirthDate dob;

}
