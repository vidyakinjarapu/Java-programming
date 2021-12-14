
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
    
    public String longest(){
        if(this.elements.isEmpty()){
            return null;
        }
        
        //Create an object to return longest every time
        String robj = this.elements.get(0);
        
        for(String element: this.elements){
            if(element.length() > robj.length()){
                robj = element;
            }           
        }
        return robj;
    }
    
}
