package ru.gb.oseminar.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Stream implements Iterable<StudentGroup>{
    private List<StudentGroup> studentGroups = new ArrayList<>();

    public Stream(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }
    
    


    @Override
    public void forEach(Consumer<? super StudentGroup> action) {
        // TODO Auto-generated method stub
        Iterable.super.forEach(action);
    }

    public Stream() {
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        this.studentGroups.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();

    }

    public Object StudentGroups() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'StudentGroups'");
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }
    
}
