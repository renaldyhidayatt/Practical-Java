package stringjava.string3;

public class Main {

    public static void main(String[] args) {
        String fullName="Micheal";
        fullName=fullName+" Jackson";
        System.out.println(fullName);
        
        String myId="A123";
        System.out.println("Before method call myId: "+myId);
        changeId(myId);
        System.out.println("After method call myId: "+myId);



    }
    public static void changeId(String id) {
        id = id + "XX";
        System.out.println("Inside the method: "+id);
    }
}
