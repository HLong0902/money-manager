package hlong92bn.moneyManager.repo;

import hlong92bn.moneyManager.model.entity.Assets;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.List;

@Repository
public interface AssetsRepo extends R2dbcRepository<Assets, Long> {
    Mono<List<Assets>> findByUserId(Long userId);
}
