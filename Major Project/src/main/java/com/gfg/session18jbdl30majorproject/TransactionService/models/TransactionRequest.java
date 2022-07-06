package com.gfg.session18jbdl30majorproject.TransactionService.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TransactionRequest {
    private String toUser;
    private Float amount;
    private TransactionType txType;
}
