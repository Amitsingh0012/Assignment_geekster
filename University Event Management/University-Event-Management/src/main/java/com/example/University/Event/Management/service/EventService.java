package com.example.University.Event.Management.service;

import com.example.University.Event.Management.model.Event;
import com.example.University.Event.Management.model.Student;
import com.example.University.Event.Management.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    EventRepo eventRepo;

    public String addEvent(Event event) {
        eventRepo.save(event);
        return "Event added";
    }

    public String updateEventById(Long eventId, String eventName) {
        Optional<Event> myEventOpt =eventRepo.findById(eventId);
        Event myEvent=null;
        if(myEventOpt.isPresent()){
            myEvent = myEventOpt.get();
        }else{
            return "Id not found";
        }
        myEvent.setEventName(eventName);
        eventRepo.save(myEvent);
        return "event updated";

    }

    public String deleteEvent(Long eventId) {
        eventRepo.deleteById((eventId));
        return "event deleted";
    }

    public List<Event> getAllEventsByDate(LocalDate date){
        return eventRepo.findAllEventByDate(date);
    }

    public Iterable<Event> getAllEvent() {
        return eventRepo.findAll();
    }
}
