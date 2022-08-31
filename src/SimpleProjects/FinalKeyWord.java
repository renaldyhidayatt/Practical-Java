package SimpleProjects;

public class FinalKeyWord {
    final int Reg_no;

    FinalKeyWord(int num){
        Reg_no = num;
    }

    void display(){
        System.out.println("Employee number is: " + Reg_no);
    }

    public static void kentang(){
        FinalKeyWord em = new FinalKeyWord(201);
        em.display();
    }
}
