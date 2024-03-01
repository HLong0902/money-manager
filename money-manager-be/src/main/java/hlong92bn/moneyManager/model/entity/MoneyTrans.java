package hlong92bn.moneyManager.model.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table
public class MoneyTrans {
    @Id
    private Long id;

    @Column
    private String tranId;//    tranId = userId + createDate

    @Column
    private String categoryId;

    @Column
    private Long userId;

    @Column
    private String type;

    @Column
    private Long value;

    @Column
    private String tranInfo;

    @Column
    private LocalDateTime createDate;

    @Column
    private String createUser;

    @Column
    private LocalDateTime updateDate;

    @Column
    private String updateUser;


}
