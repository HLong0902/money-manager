package hlong92bn.moneyManager.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserInfo {
    private String username;
    private String password;
    private String nickName;
    private String auth;
    private String phoneNumber;

    private List<AssetsDTO> assetsList;
    private List<MoneyTransDTO> moneyTranList;
}
