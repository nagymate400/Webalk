package hu.me.iit.webalk.db.db;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PeopleDto {

    public PeopleDto() {

    }

    private Long id;
    @NotEmpty
    private String name;
    @Size(min=18)
    private int age;

    public PeopleDto(People people){
        this.id = people.getId();
        this.age = people.getAge();
        this.name = people.getName();
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
