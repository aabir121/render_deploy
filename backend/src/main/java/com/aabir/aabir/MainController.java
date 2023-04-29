package com.aabir.aabir;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/api")
public class MainController {

    private final UserService userService;

    MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/data")
    public ResponseEntity<List<Employee>> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }
}
