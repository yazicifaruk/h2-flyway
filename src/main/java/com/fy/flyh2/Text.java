package com.fy.flyh2;

import javax.persistence.*;


@Entity
@Table(name="text")
public class Text
{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;

        @Column(name = "Status")
        @Enumerated(EnumType.STRING)
        private Status status;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }


        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "Text{" +
                    "id=" + id +
                    ", status=" + status +
                    '}';
        }
}
