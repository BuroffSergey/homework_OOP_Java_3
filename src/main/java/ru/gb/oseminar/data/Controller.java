package ru.gb.oseminar.data;

import java.util.List;

import javax.xml.transform.stream.StreamSource;

import ru.gb.oseminar.service.StreamServise;

public class Controller {
    @SuppressWarnings("unused")
    private StreamSource streamSource;

    public Controller(StreamSource streamSource) {
        this.streamSource = streamSource;
    }

    /**
     * @param streams
     */
    public void StreamCorporator(List<Stream> streams) {
        StreamServise.StreamCorporator(streams);
    
    }
}    
