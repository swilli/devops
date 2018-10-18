package com.willist.web;

import com.willist.db.Timetable;
import com.willist.db.TimetableEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
public class TimetableRESTApi {

    final Timetable timetable;

    @Autowired
    public TimetableRESTApi(Timetable timetable) {
        this.timetable = timetable;
    }

    @RequestMapping(value="/timetable/test", method=GET)
    public String test() {
        List<TimetableEntry> result = timetable.findByArrivalLessThan(new Date());
        return String.valueOf(result.size());
    }
}
