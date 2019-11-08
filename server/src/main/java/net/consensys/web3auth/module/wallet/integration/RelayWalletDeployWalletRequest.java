package net.consensys.web3auth.module.wallet.integration;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RelayWalletDeployWalletRequest {

    private String key;
    private String hash;
    private String signature;
    
}
