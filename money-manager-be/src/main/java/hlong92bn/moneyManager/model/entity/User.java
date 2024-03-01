package hlong92bn.moneyManager.model.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table
public class User {
    @Id
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String auth;

    @Column
    private String nickName;

    @Column
    private String phoneNumber;
}
