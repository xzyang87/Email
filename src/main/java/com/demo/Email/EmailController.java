package com.demo.Email;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EmailController {

    @RestController
    @RequestMapping("/emails")
    public class ClientAController {

        @RequestMapping("/{emailId}")
        public String getBook(@PathVariable("emailId") String emailId) {
            return "This is email id: " + emailId;
        }
    }
}
