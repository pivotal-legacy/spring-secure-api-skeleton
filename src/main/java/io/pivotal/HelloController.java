package io.pivotal;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HelloController {

    @RequestMapping(value = "/", method = GET)
    public String getMessage(Authentication authentication) {
        // Here's how you grab the current user.
        System.out.println("authentication = " + authentication.getPrincipal());

        return "hello";
    }
}
