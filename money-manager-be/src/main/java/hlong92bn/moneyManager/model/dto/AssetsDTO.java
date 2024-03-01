package hlong92bn.moneyManager.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AssetsDTO {
    private Long id;

    private Long categoryName;

    private String name;

    private Long value;

    private LocalDateTime createDate;

    private String createUser;

    private LocalDateTime updateDate;

    private String updateUser;
}
