package com.gfg.session18jbdl30majorproject.TransactionService.repos;

import com.gfg.session18jbdl30majorproject.TransactionService.entites.Transaction;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TransactionRepository extends CrudRepository<Transaction,Long> {
    Optional<Transaction> findByTxId(String txId);
}
