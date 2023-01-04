package com.example.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.*;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Table(name = "post")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue
    private int id;
    @Size(max = 100,message = "{message.invalid}")
    private String message ;
    @Past(message = "{creationDate.invalid}")
    private Date creationDate ;
    private Date updationDate ;
    @AssertTrue(message = "{isVisible.invalid}")
    private  Boolean isVisible ;
    @Size(min = 8,message = "{username.invalid}")
    private String username;
    @Email(message = "{user_email.invalid}")
    private  String user_email ;
}
