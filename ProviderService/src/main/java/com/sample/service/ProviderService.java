package com.sample.service;

import com.sample.provider.domain.Provider;
import com.sample.provider.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService {

    @Autowired
    ProviderRepository providerRepository;

    public List<Provider> getProviders() {

        return providerRepository.findAll();
    }

}
