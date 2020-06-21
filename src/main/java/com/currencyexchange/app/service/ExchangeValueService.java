package com.currencyexchange.app.service;

import com.currencyexchange.app.model.ExchangeValue;
import com.currencyexchange.app.repository.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeValueService {
    @Autowired
    private ExchangeValueRepository repository;
    public ExchangeValue findByFromAndTo(String currencyFrom, String currencyTo) {

        ExchangeValue exchangeValue = repository.findByCurrencyFromAndCurrencyTo(currencyFrom, currencyTo);
        return exchangeValue;
    }
}
