package io.pivotal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HelloController {

    @RequestMapping(value = "/", method = GET)
    public Message getMessage(Authentication authentication) {
        // Here's how you grab the current user.
        User currentUser = (User) authentication.getPrincipal();

        System.out.println("currentUser = " + currentUser);

        return new Message("hello");
    }
}
