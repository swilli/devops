package com.willist.db;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Stop {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected long id;

    protected Date arrival;
    protected Date departure;

    @ManyToOne
    protected Station station;

    public Stop(Date arrival, Date departure, Station station) {
        this.arrival = arrival;
        this.departure = departure;
        this.station = station;
    }
}
