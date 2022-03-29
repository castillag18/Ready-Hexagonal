package com.studentList.demo.infrastructure.controller;

import com.studentList.demo.aplication.service.ServiceAplicationSaveUser;
import com.studentList.demo.domain.model.Users;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final ServiceAplicationSaveUser serviceAplicationSaveUser;

    public UserController(ServiceAplicationSaveUser serviceAplicationSaveUser) {
        this.serviceAplicationSaveUser = serviceAplicationSaveUser;
    }

    @PostMapping
    public void create(@RequestBody Users users){
        serviceAplicationSaveUser.create(users);
    }

    @GetMapping
    public List<Users> read(){
        return serviceAplicationSaveUser.read();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        serviceAplicationSaveUser.delete(id);
    }

}
