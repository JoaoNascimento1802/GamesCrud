package sesi.gamecrud.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sesi.gamecrud.entities.User;
import sesi.gamecrud.repositories.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> listUsers(){
        List<User> users = userRepository.findAll();
        return ResponseEntity.ok(users);
    }


    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody @Valid User user){
        User savedUser = userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        return userRepository.findById(id)
                .map(existingUser -> {
                    existingUser.setName(user.getName());
                    existingUser.setEmail(user.getEmail());
                    existingUser.setPassword(user.getPassword());
                    userRepository.save(existingUser);
                    return ResponseEntity.ok(existingUser);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable Long id) {
        return userRepository.findById(id)
                .map(user -> {
                    userRepository.deleteById(id);
                    return ResponseEntity.noContent().build(); // 204 sem corpo
                })
                .orElse(ResponseEntity.notFound().build());   // 404 se não achar
    }



}