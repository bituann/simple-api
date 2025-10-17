package com.bituan.simple_api.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CatFactService {

    private final String catFactApiUri = "https://catfact.ninja/fact";

    public String getCatFact () {
        return new RestTemplate().getForObject(catFactApiUri, String.class);
    }
}
