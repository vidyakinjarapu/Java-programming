
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String chars = "The collection " + this.name;
        
        if(elements.isEmpty()){
            return chars + " is empty.";
        } else {                      
            
            if(this.elements.size() == 1){
                String Char = "";
                for(String element: elements){
                    Char = Char + element;
                }
                chars = chars + " has " + this.elements.size()+ " element:\n";
                return chars + Char;
            } else {
                String Char = "";
                for(String element: elements){
                    Char = Char + element + "\n";
                }
                chars = chars + " has " + this.elements.size()+ " elements:\n";
                return chars + Char;                                
            }
        }
    }
    
}
