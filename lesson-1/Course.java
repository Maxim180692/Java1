package Lesson_1.marathon;

public class Course {

    private int length1;
    private int heigth1;
    private int heigth2;
    private int length2;

    Course(int length1, int heigth1, int heigth2, int length2 ){
        this.length1=length1;
        this.heigth1 = heigth1;
        this.heigth2 = heigth2;
        this.length2 = length2;
    }

    public void doIt1(Team team) {

        Competitor [] competitor = {new Human(team.getNameH()), new Cat(team.getNameC()), new Dog(team.getNameD())};
        Obstacle[] course = {new Cross(length1), new Wall(heigth1), new Wall(heigth2), new Cross(length2)};
       for (Competitor c: competitor){
           for (Obstacle o : course){
               o.doIt(c);
               if (!c.isOnDistance()) break;
           }
       }

    }
}
