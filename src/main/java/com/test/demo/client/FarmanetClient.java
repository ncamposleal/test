package com.test.demo.client;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.test.demo.input.Farmanet;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FarmanetClient {

    private final String URL = "https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region=7";
    private RestTemplate restTemplate;

    public FarmanetClient(){
        this.restTemplate = new RestTemplate();
    }

    public List<Farmanet> getFarmanet() throws Exception {    
        
        String response = restTemplate.getForObject(URL, String.class);
        
        Gson g = new Gson(); 
        Farmanet[] data = g.fromJson(response, Farmanet[].class);
        
        return Arrays.asList(data);
    }
}