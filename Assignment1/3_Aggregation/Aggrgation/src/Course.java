public class Course {
    private String name; 
    private Instructor instructor1; 
    private Instructor instructor2;
    private Textbook textbook1;
    private Textbook textbook2;

    // Constructor with all setters and getters
    public Course(String name, Instructor instructor1, Instructor instructor2, Textbook textbook1, Textbook textbook2) {
        this.name = name;
        this.instructor1 = instructor1;
        this.instructor2 = instructor2;
        this.textbook1 = textbook1;
        this.textbook2 = textbook2;
    }
    // Accessor
    public String getName() {
        return name;
    }
    public Instructor getInstructor1() {
        return instructor1;
    }
    public Instructor getInstructor2() {
        return instructor2;
    }
    public Textbook getTextbook1() {
        return textbook1;
    }
    public Textbook getTextbook2() {
        return textbook2;
    }
    // Mutators
    public void setName(String name) {
        this.name = name;
    }
    public void setInstructor1(Instructor instructor1) {
        this.instructor1 = instructor1;
    }
    public void setInstructor2(Instructor instructor2) {
        this.instructor2 = instructor2;
    }
    public void setTextbook1(Textbook textbook1) {
        this.textbook1 = textbook1;
    }
    public void setTextbook2(Textbook textbook2) {
        this.textbook2 = textbook2;
    }
}
