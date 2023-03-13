public class Print {
    public static void printCourseInfo(Course course) {
        System.out.println("Course: " + course.getName());
        System.out.println("Instructor 1: " + course.getInstructor1().getFirstName() + " " + course.getInstructor1().getLastName() + ", Office Number: " + course.getInstructor1().getOfficeNumber());
        System.out.println("Instructor 2: " + course.getInstructor2().getFirstName() + " " + course.getInstructor2().getLastName() + ", Office Number: " + course.getInstructor2().getOfficeNumber());
        System.out.println("Textbook 1: " + course.getTextbook1().getTitle() + " by " + course.getTextbook1().getAuthor() + ", Publisher: " + course.getTextbook1().getPublisher());
        System.out.println("Textbook 2: " + course.getTextbook2().getTitle() + " by " + course.getTextbook2().getAuthor() + ", Publisher: " + course.getTextbook2().getPublisher());
    }
}
