package SimpleProjects;

public class ForthPattern {
    public static void kentang(){
        int x,y;
        for(x = 1; x <= 7; x++){
            for(y=1;y < x; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
