package com.bituan.simple_api.service;

import com.bituan.simple_api.model.CatFact;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class CatFactService {

    public String getCatFact () {
        RestTemplate restTemplate = new RestTemplate();
        final String catFactApiUri = "https://catfact.ninja/fact";

        ResponseEntity<CatFact> response = restTemplate.getForEntity(catFactApiUri, CatFact.class);

        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody().getFact();
        } else {
            return "Sometimes, there are simply no facts! (Our facts provider is down)";
        }


    }
}
