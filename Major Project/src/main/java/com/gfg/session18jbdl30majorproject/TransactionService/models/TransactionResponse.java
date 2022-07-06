package com.gfg.session18jbdl30majorproject.TransactionService.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TransactionResponse {
    private String txId;
    private TransactionStatus transactionStatus;
}
