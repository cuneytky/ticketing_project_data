package com.cydeo.entity;

import com.cydeo.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
//@Where(clause = "is_deleted=false")  // SELECT * from users where id=4 and is_deleted=false;
public class User extends BaseEntity {
    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String userName;
    private String passWord;
    private boolean enabled;
    private String phone;
    @ManyToOne
    private Role role;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
