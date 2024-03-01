package hlong92bn.moneyManager.repo;

import hlong92bn.moneyManager.model.entity.MoneyTrans;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

import java.util.List;

public interface MoneyTransRepo extends R2dbcRepository<MoneyTrans, Long> {
    Mono<List<MoneyTrans>> findByUserId(Long userId);
}
