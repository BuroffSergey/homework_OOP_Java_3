package ru.gb.oseminar.service;

import java.util.Collections;
import java.util.List;

import ru.gb.oseminar.data.Stream;
import ru.gb.oseminar.data.StreamComparator;

public class StreamServise {
    public static void StreamCorporator(List<Stream> streams) {

        Collections.sort(streams, new StreamComparator());
        
    }
    
}
