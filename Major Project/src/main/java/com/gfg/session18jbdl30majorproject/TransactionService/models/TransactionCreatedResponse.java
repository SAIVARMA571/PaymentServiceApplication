package com.gfg.session18jbdl30majorproject.TransactionService.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TransactionCreatedResponse {
    private String transactionId;
    private String toUser;
    private Float amount;
    private String fromUser;
}
