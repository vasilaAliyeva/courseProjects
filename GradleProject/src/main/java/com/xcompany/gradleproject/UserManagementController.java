package com.xcompany.gradleproject;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/users")
public class UserManagementController {

    public Map<Long, String> users = new HashMap<Long, String>();


    @GetMapping
    public Map<Long, String> getUsers() {
        return users;
    }

    @PostMapping
    public void addUser(long id, String name) {
        //check if  not exist on  map - xeta at yoxdusa elave et
        if (!users.containsKey(id)) {
            users.put(id, name);
        } else {
            System.out.println("User already exists");
        }
    }

    @PutMapping
    public void updateUser(long id, String name) {
        //check if user exist bt id - varsa get elemeliym ve update elemeliyem if not return user not found
        if (users.containsKey(id)) {
            users.put(id, name);
        } else {
            System.out.println("User does not exist by id " + id);
        }
    }

    @DeleteMapping
    public void deleteUser(long id) {
        if (users.containsKey(id)) {
            users.remove(id);
        } else {
            System.out.println("User does not exist by id " + id);
        }
    }

    {
        users.put(1L, "John Doe"); //row non null, unique, primary key
        users.put(2L, "Jane Doe");
        users.put(3L, "Jack Doe");

    }
}

//postgresql port 5432
//mysql port 1433

//NoSQL - datani file formasinda saxliyir folderde
//RDBMS- relational - table
//connection pool - database baglanmaq
// 5432 portu dockerde olur - service qaldiracg - docker compose file
//docker compose ile bizim kompda teze bir server qaldira bilerik