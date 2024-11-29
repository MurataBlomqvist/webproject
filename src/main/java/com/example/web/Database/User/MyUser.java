package com.example.web.Database.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "users", schema = "webproject")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 45)
    private String username;
    @Column(nullable = false, length = 64)
    private String password;
    @Column(name = "first_name", length = 64)
    private String firstname;
    @Column(name = "last_name", length = 64)
    private String lastname;
    private Character status;
    private String roles;
    @Column(name = "creation_date", length = 8)
    private String creationDate;
    @Column(name = "creation_user", length = 45)
    private String creationUser;
    @Column(name = "update_date", length = 8)
    private String updateDate;
    @Column(name = "update_user", length = 45)
    private String updateUser;

}
