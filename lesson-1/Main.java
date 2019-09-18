package Lesson_1.marathon;

public class Main {
    public static void main(String[] args) {

        Team  teams = new Team("Максим","Мурзик","Бетховен");
        Course course = new Course(80,2,1,120);
        course.doIt1(teams);
        teams.info1();

    }
}
