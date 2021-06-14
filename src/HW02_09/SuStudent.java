package HW02_09;

import java.util.ArrayList;
import java.util.List;

public class SuStudent implements Student{

    String name;
    List<Course> cources = new ArrayList<>();

    public void setCource (Course course){
        cources.add(course);
    }

    public void setName(String name) { this.name = name; }

    @Override
    public String getName() { return name; }

    @Override
    public List<Course> getAllCourses() { return cources; }

    @Override
    public String toString() {
        return "Name of Student: " + name + ";";
    }
}
