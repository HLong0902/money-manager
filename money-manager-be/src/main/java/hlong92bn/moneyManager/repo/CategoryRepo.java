package hlong92bn.moneyManager.repo;

import hlong92bn.moneyManager.model.entity.Category;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.List;

@Repository
public interface CategoryRepo extends R2dbcRepository<Category, Long> {
    //    @Query(value = "SELECT ")
    Mono<List<Category>> findByUserId(Long userId);
}
