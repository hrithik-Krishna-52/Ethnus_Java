public class Hypertrophy {
    String exercises = "Bench Press";
    int reps = 12;
    int sets = 3;

Hypertrophy(String exercises, int reps, int sets) {
    this.exercises = exercises;
    this.reps = reps;
    this.sets = sets;
}

    void plan() {
        System.out.println(exercises);
        System.out.println(reps);
        System.out.println(sets);
    }
}
