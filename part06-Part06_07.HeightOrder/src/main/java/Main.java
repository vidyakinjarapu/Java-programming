
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room room = new Room();
        System.out.println("Empty room? :" + room.isEmpty());
        room.add(new Person("Lia", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Tehri", 185));
        room.add(new Person("Denver", 145));
        
        System.out.println("");
        for(Person person: room.getPersons()){
            System.out.println(person);
        }
        
        System.out.println("");
        System.out.println("Shortest person in the room : " + room.shortest());
        
        System.out.println();
        System.out.println("Shortest: " + room.take());
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
        
    }
}
