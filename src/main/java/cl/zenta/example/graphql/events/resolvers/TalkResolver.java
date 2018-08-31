package cl.zenta.example.graphql.events.resolvers;

import cl.zenta.example.graphql.events.entities.Speaker;
import cl.zenta.example.graphql.events.entities.Talk;
import cl.zenta.example.graphql.events.services.SpeakerClientService;
import cl.zenta.example.graphql.events.services.TalkClientService;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TalkResolver implements GraphQLResolver<Talk> {

    @Autowired
    private TalkClientService talkClientService;

    @Autowired
    private SpeakerClientService speakerClientService;

    public Speaker getSpeaker(Talk talk) {

        return speakerClientService.findById( talk.getIdSpeaker() );
    }

}
