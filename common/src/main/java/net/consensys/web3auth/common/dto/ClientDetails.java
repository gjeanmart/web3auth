package net.consensys.web3auth.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClientDetails {

    private String appId;
    private String clientId;
    private ClientType type;
    
}
