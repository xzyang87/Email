package com.demo.Email;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {
    @GetMapping
    public String getUserEmail(@RequestParam(defaultValue = "") Long userId) {
        return String.format("%s@rest.local", userId);
    }
}
