package br.pucpr.GameHub.controll;

import br.pucpr.GameHub.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    List<UserDTO> users = new ArrayList<>();

    @GetMapping
    public List<UserDTO> findAll(){
        return users;
    }

    @PostMapping
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO user){
        users.add(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }





}
