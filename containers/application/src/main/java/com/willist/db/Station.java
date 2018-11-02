package com.willist.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Station {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected long id;
    protected String name;

    public Station(String name) {
        this.name = name;
    }

}
