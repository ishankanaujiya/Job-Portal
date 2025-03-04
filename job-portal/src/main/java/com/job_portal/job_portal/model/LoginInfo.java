package com.job_portal.job_portal.model;

import jakarta.persistence.*;

@Entity
@Table(name="login_info")
public class LoginInfo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates the primary key
    private int id;

    @Column(unique = true, nullable = false)
    private String username;


    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
