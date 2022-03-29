package com.studentList.demo.aplication.service;

import com.studentList.demo.domain.model.Users;
import com.studentList.demo.infrastructure.repository.UsersRepository;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ServiceAplicationSaveUser {

    private final UsersRepository usersRepository;

    public ServiceAplicationSaveUser(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void create(Users users){
        usersRepository.save(users);
    }

    public List<Users> read(){
        return usersRepository.findAll();
    }

    public void delete(Integer id){
        usersRepository.deleteById(id);
    }
}
