import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ExerciseManagementTest {
    private ExerciseManagement mgnt;
    
    @Before 
    public void initialize(){
        mgnt = new ExerciseManagement();
    }
    
    @Test
    public void excerciseListEmptyAtBeginning(){
//        ExerciseManagement mgnt = new ExerciseManagement();
        assertEquals(0, mgnt.exerciseList().size());
    }
    
    @Test
    public void addingExcerciseGrowsByOne(){
//        ExerciseManagement mgnt = new ExerciseManagement();
        mgnt.add("Write a test");
        assertEquals(1, mgnt.exerciseList().size());
    }
    
    @Test
    public void addedExcerciseIsInList(){
        mgnt.add("Sample ex");
        assertTrue(mgnt.exerciseList().contains("Sample ex"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        mgnt.add("new ex");
        mgnt.markAsCompleted("new ex");
        assertTrue(mgnt.isCompleted("new ex"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted(){
        mgnt.add("new ex");
        mgnt.markAsCompleted("new ex");
        assertFalse(mgnt.isCompleted("new ex"));
    } 
}
