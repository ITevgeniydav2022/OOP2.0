public class Human {

    String name;
    private String town;
    private int yearBirth;
    String job;




    public Human(String name, String town, int yearBirth, String job) {

        this.name = name;
        if (this.name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        }

        setTown(town);

        setYearBirth(yearBirth);

        this.job = job;
        if (this.job == null || job.isEmpty()) {
            this.job = "Информация не указана";
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
        if (this.town == null || town.isEmpty()) {
            this.town = "Информация не указана";
        }
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
        if (this.yearBirth < 0) {
            this.yearBirth = 0;
        }
    }

    @Override
    public String toString() {
        return ("Привет! Меня зовут " + name + ". Я из города " + town +
                ". Я родился (лась) в " + yearBirth + " году. Я работаю на должности " + job +
                ". Будем знакомы!");
    }

    public void print() {
        System.out.println(this);
    }
}
