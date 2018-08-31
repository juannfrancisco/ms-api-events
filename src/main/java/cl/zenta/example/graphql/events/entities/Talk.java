package cl.zenta.example.graphql.events.entities;

public class Talk {

    private Integer id;
    private String name;
    private String startTime;
    private String endTime;
    private Integer idSpeaker;
    private Speaker speaker;

    public Integer getId() {
        return id;
    }

    public Integer getIdSpeaker() {
        return idSpeaker;
    }

    public void setIdSpeaker(Integer idSpeaker) {
        this.idSpeaker = idSpeaker;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
}
