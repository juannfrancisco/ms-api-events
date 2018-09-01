package cl.zenta.example.graphql.events.resolvers;

import cl.zenta.example.graphql.events.entities.Speaker;
import cl.zenta.example.graphql.events.entities.types.InputCreateSpeaker;
import cl.zenta.example.graphql.events.services.SpeakerClientService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MutationResolver implements GraphQLMutationResolver {

    @Autowired
    private SpeakerClientService speakerClientService;

    public Speaker saveSpeaker( String name, String bio ){
        Speaker speaker = new Speaker();
        speaker.setName(name);
        speaker.setBio(bio);
        speaker.setId(12);
        return speaker;
    }

    public Speaker saveSpeakerInput(InputCreateSpeaker input){
        Speaker speaker = new Speaker();
        speaker.setName(input.getName());
        speaker.setBio(input.getBio());
        speaker.setId(13);
        return speaker;
    }
}
