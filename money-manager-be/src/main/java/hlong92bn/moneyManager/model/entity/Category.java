package hlong92bn.moneyManager.model.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table
public class Category {
    @Id
    private Long id;

    @Column
    private Long userId;

    @Column
    private String name;

    @Column
    private String categoryInfo;

    @Column
    private LocalDateTime createDate;

    @Column
    private String createUser;

}
