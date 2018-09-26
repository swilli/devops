package com.willist.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


public interface Timetable extends CrudRepository<TimetableEntry, Long> {

    List<TimetableEntry> findByArrivalLessThan(Date date);

}
