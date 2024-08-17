package com.example.demo_sample_code.controller;

import com.example.demo_sample_code.dto.request.UserRequestDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {

    @PostMapping("/")
    public String addUser(@Valid @RequestBody UserRequestDTO userDTO) {
        return "User add";
    }

    @GetMapping("/users")
    public String getUser() {
        return "Get user";
    }

    @PutMapping("/{id}")
    public String updateUser(@Min (value = 1) @PathVariable int id, @RequestBody UserRequestDTO userDTO) {
        return "id = " + (id + 2);
    }

    @PatchMapping("/{id}")
    public String changeStatus(@PathVariable int id, @RequestParam(required = false) boolean status) {
        return "id: " + id + ", status da thay doi: " + !status;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@Min(value = 1, message = "userId must be greater than 0") @PathVariable int id) {
        return "đã xoa nguoi dung co id la: " + id;
    }

//    @GetMapping("/{id}")
//    public UserRequestDTO getUser(@PathVariable int id) {
//        return  new UserRequestDTO("Pham", "Tri", "baotri2802@gmail.com", "0941023775");
//    }
//
//    @GetMapping("/list")
//    public List<UserRequestDTO> getListUser(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int count) {
//        return List.of(
//                new UserRequestDTO("Pham", "Tri", "baotri2802@gmail.com", "0941023775"),
//                new UserRequestDTO("Pham", "Tri", "baotri2802@gmail.com", "0941023775"),
//                new UserRequestDTO("Pham", "Tri", "baotri2802@gmail.com", "0941023775"),
//                new UserRequestDTO("Pham", "Tri", "baotri2802@gmail.com", "0941023775")
//        );
//    }
}
