package hu.me.iit.webalk.db.db;

import java.util.List;

public class PeopleServiceImpl implements PeopleService{
    private final PeopleRepository peopleRepository;

    public  PeopleServiceImpl(PeopleRepository peopleRepository){
        this.peopleRepository = peopleRepository;
    }

    public Iterable<People> getAllPeople() {
        return peopleRepository.findAll();
    }
}
