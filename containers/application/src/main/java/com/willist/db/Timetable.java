package com.willist.db;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface Timetable extends CrudRepository<Connection, Long> {

    @Query("SELECT c FROM Connection c WHERE station IN c.stops")
    List<Connection> findAllConnectionsGoingThroughStation(@Param("station") Station station);

}

