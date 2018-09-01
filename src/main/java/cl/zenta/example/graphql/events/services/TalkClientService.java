package cl.zenta.example.graphql.events.services;

import cl.zenta.example.graphql.events.entities.Talk;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class TalkClientService {

    private static Logger logger = LoggerFactory.getLogger(TalkClientService.class);

    @Value("${app.api.dal.talks}")
    private String api;


    public Talk findById(Integer id){
        RestTemplate restTemplate = new RestTemplate();
        logger.info( "obteniendo talk by id "+ id );
        try{
            Talk obj = restTemplate.getForObject(api+"/"+ id, Talk.class);
            return obj;
        }
        catch (Exception ex){
            return null;
        }
    }

    public List<Talk> findAll(){
        RestTemplate restTemplate = new RestTemplate();
        Talk[] list = restTemplate.getForObject(api+"/", Talk[].class);
        return Arrays.asList(list);
    }
}
