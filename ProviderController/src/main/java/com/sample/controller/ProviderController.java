package com.sample.controller;

import com.sample.provider.domain.Provider;
import com.sample.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProviderController {


    @Autowired
    ProviderService providerService;

    @GetMapping(value = "/provders")
    public ResponseEntity<List<Provider>> getProviders() {
        List<Provider> providers = providerService.getProviders();
        return new ResponseEntity<>(providers, HttpStatus.OK);
    }

}
