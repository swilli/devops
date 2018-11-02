package com.willist.web;

import com.willist.db.Connection;
import com.willist.db.Station;
import com.willist.db.Stop;
import com.willist.db.Timetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
public class TimetableRESTApi {

    Timetable timetable;

    @Autowired
    public TimetableRESTApi(Timetable timetable) {
        this.timetable = timetable;
    }

    @RequestMapping(value="/connection/test", method=GET)
    public String test() {
        Station s = new Station("Hardbruecke");
        List<Connection> connections = timetable.findAllConnectionsGoingThroughStation(s);
        return String.valueOf(connections.size());
    }
}
