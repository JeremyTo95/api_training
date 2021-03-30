package fr.esiea.ex4A.api;

import org.apache.tomcat.util.json.ParseException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
    private final LoveService loveService;

    public ApiController(LoveService loveService) { this.loveService = loveService; }

    @PostMapping(path = "/api/inscription")
    void inscription(@RequestBody String userInfo) throws ParseException {
        UserInfo user = new UserInfo(userInfo);
        loveService.signinUser(user);
    }

    @GetMapping(path = "/api/matches", produces = MediaType.APPLICATION_JSON_VALUE)
    List<UserInfo> matches() {
        return loveService.getUserList();
    }
}
