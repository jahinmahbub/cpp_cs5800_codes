public class Driver {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("Tony", "Diaz", "8-0345");
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Head First Java", "Kathy Sierra and Bert Bates", "O'Reilly Media");
        Textbook textbook3 = new Textbook("Java: A Beginner's Guide", "Herbert Schildt", "McGraw-Hill Education");
        Instructor instructor3 = new Instructor("Jane", "Smith", "5-5678");
        Course course = new Course("Introduction to Programming", instructor1, instructor2, textbook1, textbook2);
        course.setInstructor2(instructor3);
        course.setTextbook2(textbook3);
        Print.printCourseInfo(course);

    }
}
