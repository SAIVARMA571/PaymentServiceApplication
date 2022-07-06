package com.gfg.session18jbdl30majorproject.TransactionService.entites;
import com.gfg.session18jbdl30majorproject.TransactionService.models.TransactionStatus;
import com.gfg.session18jbdl30majorproject.TransactionService.models.TransactionType;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String txId;
    private String fromUser;
    private String toUser;
    private Float amount;
    private TransactionType txType;
    private TransactionStatus status;
    @Temporal(value = TemporalType.DATE)
    private Date date;
}
