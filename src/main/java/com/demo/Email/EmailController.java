package com.demo.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@SpringBootApplication
public class EmailController {

    @Autowired
    Environment environment;

    @RestController
    public class ClientAController {

        @RequestMapping("/emails/{emailId}")
        public String getBook(@PathVariable("emailId") String emailId) throws UnknownHostException {

            String port = environment.getProperty("server.port");
            System.out.print(String.format("****************** Access Email from port %s ******************\n", port));
            return emailId + "@rest.local";
        }

        @RequestMapping(value = "/")
        public String home() {
            System.out.print("************ ping email ************ \n");
            return "Emails says hi!";
        }
    }
}
