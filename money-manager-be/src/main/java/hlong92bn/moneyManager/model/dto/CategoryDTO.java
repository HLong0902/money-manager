package hlong92bn.moneyManager.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CategoryDTO {
    private Long id;

    private Long userId;

    private String name;

    private String categoryInfo;

    private LocalDateTime createDate;

    private String createUser;
}
