package com.fy.flyh2;

import javax.persistence.*;

@Entity
@Table(name="Due_Date")
public class Due_Date{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Temporal(TemporalType.DATE)
    private java.util.Date due_Date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public java.util.Date getDate() {
        return due_Date;
    }

    public void setDate(java.util.Date date) {
        this.due_Date = date;
    }

    @Override
    public String toString() {
        return "Due_Date{" +
                "id=" + id +
                ", due_Date=" + due_Date +
                '}';
    }
}
