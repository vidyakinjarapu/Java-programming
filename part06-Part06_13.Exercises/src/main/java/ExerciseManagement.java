import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<String> exercises;
    private ArrayList<String> completedExcercises;
    
    public ExerciseManagement(){
        this.exercises = new ArrayList<>();
        this.completedExcercises = new ArrayList<>();
    }  
    
    public ArrayList<String> exerciseList(){
        return this.exercises;
    }
    
//    public ArrayList<String> completedExcercises(){
//        return this.completedExcercises;
//    }
//    
    public void add(String exercise){
        this.exercises.add(exercise);
    }
    
    public void markAsCompleted(String exercise){
        this.completedExcercises.add(exercise);
    }
    
    public boolean isCompleted(String exercise){
        return this.completedExcercises.contains(exercise);
    }    
}