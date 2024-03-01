package hlong92bn.moneyManager.endPoint;

import hlong92bn.moneyManager.model.entity.User;
import hlong92bn.moneyManager.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping(value = "user-info")
    public Mono<User> getUserInfo(@RequestParam String phoneNumber) {
        return userService.getUserInfo(phoneNumber);
    }
}
