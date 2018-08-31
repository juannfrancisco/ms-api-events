package cl.zenta.example.graphql.events.services;

import cl.zenta.example.graphql.events.entities.Speaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class SpeakerClientService {

    @Value("${app.api.dal.speakers}")
    private String api;


    public Speaker findById(Integer id){
        RestTemplate restTemplate = new RestTemplate();
        Speaker obj = restTemplate.getForObject(api+"/"+ id, Speaker.class);
        return obj;
    }

    public List<Speaker> findAll(){
        RestTemplate restTemplate = new RestTemplate();
        Speaker[] list = restTemplate.getForObject(api+"/", Speaker[].class);
        return Arrays.asList(list);
    }
}
