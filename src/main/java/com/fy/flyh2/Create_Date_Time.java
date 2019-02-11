package com.fy.flyh2;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Create_Date_Time{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date create_date_Time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreate_date_Time() {
        return create_date_Time;
    }

    public void setCreate_date_Time(Date create_date_Time) {
        this.create_date_Time = create_date_Time;
    }

    @Override
    public String toString() {
        return "Create_Date_Time{" +
                "id=" + id +
                ", create_date_Time=" + create_date_Time +
                '}';
    }
}
