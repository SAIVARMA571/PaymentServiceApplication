package com.gfg.session18jbdl30majorproject.WalletService.Entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class WalletResponse {
    private String txId;
    private WalletStatus success;
}
