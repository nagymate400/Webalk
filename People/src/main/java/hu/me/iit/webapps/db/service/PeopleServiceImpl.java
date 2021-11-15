package hu.me.iit.webapps.db.service;

import hu.me.iit.webapps.db.repository.PeopleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {
    private final PeopleRepository peopleRepository;

    public PeopleServiceImpl(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public People create(People people){
        return peopleRepository.save(new hu.me.iit.webapps.db.repository.People(people));
    }

    @Override
    public Iterable<People> getAllPeople() {
        List<People> rv = new ArrayList<>();
        for (hu.me.iit.webapps.db.repository.People people : peopleRepository.findAll()) {
            rv.add(new People(people));
        }
        return rv;
    }
}
