package com.fy.flyh2;

import javax.persistence.*;

@Entity
@Table(name="Username")
public class Username{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Username{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
