package hlong92bn.moneyManager.service;

import hlong92bn.moneyManager.model.dto.UserInfo;
import hlong92bn.moneyManager.model.entity.User;
import hlong92bn.moneyManager.repo.AssetsRepo;
import hlong92bn.moneyManager.repo.CategoryRepo;
import hlong92bn.moneyManager.repo.MoneyTransRepo;
import hlong92bn.moneyManager.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    private final AssetsRepo assetsRepo;
    private final CategoryRepo categoryRepo;
    private final MoneyTransRepo moneyTransRepo;

    public Mono<User> getUserInfo(String phone) {
        return userRepo.findUserByPhoneNumber(phone);
    }
}
