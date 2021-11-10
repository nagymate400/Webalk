package hu.me.iit.webapps.db.controller;

import hu.me.iit.webapps.db.service.People;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

import hu.me.iit.webapps.db.service.PeopleService;

@RestController
@RequestMapping("/people")
public class PeopleController {
    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping
    public Iterable<PeopleDto> getallPeople(){
        List<PeopleDto>peopleDtoList=new ArrayList<>();
        for (People people :peopleService.getAllPeople())
        {
            peopleDtoList.add(new PeopleDto(people));
        }
        return peopleDtoList;
    }
    public PeopleDto save(PeopleCreateDto peopleCreateDto) {
       return new PeopleDto(peopleService.create(peopleCreateDto.toPeople()));
    }

}
