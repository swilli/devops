package com.willist.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Date;

@Entity
public class TimetableEntry {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;
    private Date arrival;

    protected TimetableEntry() {}

    public TimetableEntry(String name, Date arrival) {
        this.name = name;
        this.arrival = arrival;
    }

}
