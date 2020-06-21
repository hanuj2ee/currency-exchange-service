package com.currencyexchange.app.controller;

import com.currencyexchange.app.model.ExchangeValue;
import com.currencyexchange.app.service.ExchangeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyExchangeController {
    @Autowired
    private ExchangeValueService service;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
        ExchangeValue list = service.findByFromAndTo(from, to);

        return list;
    }
}
