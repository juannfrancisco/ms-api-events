package cl.zenta.example.graphql.events.resolvers;

import cl.zenta.example.graphql.events.entities.Speaker;
import cl.zenta.example.graphql.events.entities.Talk;
import cl.zenta.example.graphql.events.exceptions.ObjectNotFoundException;
import cl.zenta.example.graphql.events.services.SpeakerClientService;
import cl.zenta.example.graphql.events.services.TalkClientService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueryResolver implements GraphQLQueryResolver {


    @Autowired
    private SpeakerClientService speakerClientService;

    @Autowired
    private TalkClientService talkClientService;

    public Iterable<Speaker> speakers( ){
        Iterable<Speaker> list = speakerClientService.findAll();
        return list;
    }

    public Speaker speaker( Integer id ){
        Speaker speaker = speakerClientService.findById(id);
        if(null == speaker){
            throw new ObjectNotFoundException("Speaker not found", id);
        }
        return speaker;
    }


    public Iterable<Talk> talks( ){
        Iterable<Talk> list = talkClientService.findAll();
        return list;
    }

    public Talk talk( Integer id ){
        Talk talk = talkClientService.findById(id);
        if(null == talk){
            throw new ObjectNotFoundException("Talk not found", id);
        }
        return talk;
    }
}
