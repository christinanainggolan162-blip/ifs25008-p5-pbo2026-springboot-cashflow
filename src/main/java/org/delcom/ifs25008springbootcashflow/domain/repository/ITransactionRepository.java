package org.delcom.ifs25008springbootcashflow.domain.repository;

import org.delcom.ifs25008springbootcashflow.domain.entity.Transaction;
import org.delcom.ifs25008springbootcashflow.domain.entity.TransactionType;
import java.util.List;

public interface ITransactionRepository extends IRepository<Transaction, Integer> {

    Transaction save(Integer userId, String description, long amount, TransactionType type, String proofPath);

    List<Transaction> findByUserId(Integer userId);
}
