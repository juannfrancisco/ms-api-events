package cl.zenta.example.graphql.events.controllers;

import cl.zenta.example.graphql.events.entities.Speaker;
import cl.zenta.example.graphql.events.entities.Talk;
import cl.zenta.example.graphql.events.services.SpeakerClientService;
import cl.zenta.example.graphql.events.services.TalkClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    private SpeakerClientService speakerClientService;

    @Autowired
    private TalkClientService talkClientService;

    @RequestMapping(method = RequestMethod.GET, value="/speakers")
    public Iterable<Speaker> findAll( ){
        Iterable<Speaker> list = speakerClientService.findAll();
        return list;
    }

    @RequestMapping(method = RequestMethod.GET , value="/speakers/{id}")
    public Speaker findById(@PathVariable("id") Integer id ){
        return speakerClientService.findById(id);
    }


    @RequestMapping(method = RequestMethod.GET, value="/talks")
    public Iterable<Talk> findAllTalks( ){
        Iterable<Talk> list = talkClientService.findAll();
        return list;
    }

    @RequestMapping(method = RequestMethod.GET , value="/talks/{id}")
    public Talk findByIdTalk(@PathVariable("id") Integer id ){
        return talkClientService.findById(id);
    }
}
