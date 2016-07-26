package io.pivotal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class SessionController {
    // This endpoint is misleading, because we can actually use
    // Basic Authentication with any endpoint to get an X-AUTH-TOKEN
    @RequestMapping(value = "/sessions", method = POST)
    public Map<String, String> createSession(Principal principal) {
        HashMap<String, String> result = new HashMap<>();

        result.put("username", principal.getName());

        return result;
    }

    @RequestMapping(value = "/sessions", method = DELETE)
    @ResponseStatus(NO_CONTENT)
    public void deleteSession(HttpSession session) {
        session.invalidate();
    }
}
