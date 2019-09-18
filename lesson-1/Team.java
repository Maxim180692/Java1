package Lesson_1.marathon;

public class Team {
    private String nameH;
    private  String nameC;
    private String nameD;
    private String nameH2;


    Team(String nameH, String nameC, String nameD) {
        this.nameH = nameH;
        this.nameC = nameC;
        this.nameD = nameD;
        this.nameH2 = nameH2;
    }
    public String getNameH(){
        return nameH;
    }

    public String getNameC() {
        return nameC;
    }

    public String getNameD() {
        return nameD;
    }

    public void info1(){
        Competitor [] competitors = {new Human(nameH), new Cat(nameC), new Dog(nameD)};
        for (Competitor c: competitors) {
            c.info();
        }
    }
}
