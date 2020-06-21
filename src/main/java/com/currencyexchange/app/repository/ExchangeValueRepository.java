package com.currencyexchange.app.repository;

import com.currencyexchange.app.model.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

    public ExchangeValue findByCurrencyFromAndCurrencyTo(String currencyFrom, String currencyTo);
}
