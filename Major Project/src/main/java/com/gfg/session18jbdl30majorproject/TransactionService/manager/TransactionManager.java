package com.gfg.session18jbdl30majorproject.TransactionService.manager;

import com.gfg.session18jbdl30majorproject.TransactionService.models.TransactionRequest;
import com.gfg.session18jbdl30majorproject.TransactionService.models.TransactionResponse;
import com.gfg.session18jbdl30majorproject.TransactionService.models.TransactionStatus;

public interface TransactionManager {

    String create(TransactionRequest transactionRequest, String username);
    TransactionResponse get(String transactionId) throws Exception;
    void updateStatus(String updateRequest) throws Exception;
}
