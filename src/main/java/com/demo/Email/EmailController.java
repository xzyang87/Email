package com.demo.Email;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EmailController {

    @RestController
    public class ClientAController {

        @RequestMapping("/emails/{emailId}")
        public String getBook(@PathVariable("emailId") String emailId) {
            System.out.print("****** Access Email ******\n");
            return emailId + "@rest.local";
        }

        @RequestMapping(value = "/")
        public String home() {
//            System.out.print("Access /");
            return "Emails says hi!";
        }
    }
}
