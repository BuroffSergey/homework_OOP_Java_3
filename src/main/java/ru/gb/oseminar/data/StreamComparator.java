package ru.gb.oseminar.data;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    
    public int compare(Stream o1, Stream o2) {
        int countGroupsOfStream1 = o1.getStudentGroups().size();
        int countGroupsOfStream2 = o2.getStudentGroups().size();

        return Integer.compare(countGroupsOfStream1, countGroupsOfStream2);

    


    }
    
}
