package com.sunrise.spring.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;

/**
 * Transation.
 *
 * @author yz
 * @since : 1.0 2024/7/19
 **/
@Service
public class TransactionService {
    @Resource
    private TransactionTemplate transactionTemplate;

    public void updateSomeData() {
        transactionTemplate.execute(status -> {
            // do something
            return null;
        });
    }
}
