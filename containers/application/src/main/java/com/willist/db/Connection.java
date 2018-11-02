package com.willist.db;

import javax.persistence.*;
import java.util.List;

@Entity
public class Connection {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    protected long id;

    @ManyToOne
    protected Vehicle vehicle;

    @ElementCollection
    protected List<Stop> stops;

    public Connection(Vehicle vehicle, List<Stop> stops) {
        this.vehicle = vehicle;
        this.stops = stops;
    }
}
