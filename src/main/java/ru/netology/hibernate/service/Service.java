package ru.netology.hibernate.service;

import java.util.List;

import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.repository.Repository;

@org.springframework.stereotype.Service
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
