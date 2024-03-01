package hlong92bn.moneyManager.repo;

import hlong92bn.moneyManager.model.entity.User;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepo extends R2dbcRepository<User, Long> {
    Mono<Boolean> findByAuth(String auth);

    Mono<User> getUserByPhoneNumber(String phoneNumber);

    Mono<User> findUserByPhoneNumber(String phoneNumber);


    Mono<User> getUserByAuth(String auth);

    @Query(value = "Select * from user where id = :userId limit 1")
    User findUserById(@Param("userId") Long userId);
}
