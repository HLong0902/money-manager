package hlong92bn.moneyManager.model.dto;

import lombok.Data;

@Data
public class MoneyTransDTO {
    private Long id;

    private String tranId;//    tranId = userId + createDate

    private String categoryName;

    private String type;

    private Long value;

    private String tranInfo;
}
