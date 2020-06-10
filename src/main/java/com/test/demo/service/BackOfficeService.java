package com.test.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.test.demo.client.FarmanetClient;
import com.test.demo.input.Farmanet;
import com.test.demo.input.InputDTO;
import com.test.demo.output.Wrapper;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

@Service
public class BackOfficeService implements IBackOfficeService {

    private static Logger LOGGER = LoggerFactory.getLogger(BackOfficeService.class);

    @Autowired
    private FarmanetClient farmanetClient;

    @Override
    public Wrapper getFarmanet(InputDTO inputDto) throws Exception {
        LOGGER.info("Inicio obtener farmanet");

        Wrapper wrapper = new Wrapper();

        List<Farmanet> list = farmanetClient.getFarmanet();
        
        if(!"".equals(inputDto.getComuna())){
            list = this.filterBy(inputDto, list);
        }
        wrapper.setData(list);
        wrapper.setOK(true);
        return wrapper;
    }
    
    private List<Farmanet> filterBy(InputDTO inputDto, List<Farmanet> list){

        List<Farmanet> filtered = new ArrayList<Farmanet>();

        for(Farmanet val : list){
            if(val.getComuna_nombre().contains(inputDto.getComuna())){
                filtered.add(val);
            }
        }

        return filtered;
    }
}