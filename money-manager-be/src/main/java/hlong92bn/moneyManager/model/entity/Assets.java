package hlong92bn.moneyManager.model.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table
public class Assets {
    @Id
    private Long id;

    @Column
    private Long categoryId;

    @Column
    private Long userId;

    @Column
    private String name;

    @Column
    private Long value;

    @Column
    private LocalDateTime createDate;

    @Column
    private String createUser;

    @Column
    private LocalDateTime updateDate;

    @Column
    private String updateUser;
}
