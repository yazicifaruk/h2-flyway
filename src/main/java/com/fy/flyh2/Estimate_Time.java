package com.fy.flyh2;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "Estimate_Time")
public class Estimate_Time{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Time estimate_time;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getEstima_time() {
        return estimate_time;
    }

    public void setEstima_time(Time estima_time) {
        this.estimate_time = estima_time;
    }

    @Override
    public String toString() {
        return "Estimate_Time{" +
                "id=" + id +
                ", estimate_time=" + estimate_time +
                '}';
    }
}
