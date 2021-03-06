package hu.me.iit.webapps.db.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class People {
    @Id
    @GeneratedValue
    private Long id;

    private int age;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public People(hu.me.iit.webapps.db.repository.People people) {
        this.age = people.getAge();
        this.name = people.getName();
        this.id = people.getId();;
    }

    public hu.me.iit.webapps.db.repository.People toEntity() {
        return new hu.me.iit.webapps.db.repository.People;
    }
}
