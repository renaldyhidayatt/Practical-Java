package ArrayLecture;

public class Arrays {
    public static void kentang(){
        int num[] = {
                100,
                200,
                -99,
                70,
                93
        },i;
        for (i = 0; i <= 4;i++){
            System.out.print(num[i] + ",");
        }

        System.out.print("\n");
        String []names = {
                "kettel",
                "pot",
                "Cup",
                "Jug"
        };
        for (String name: names){
            System.out.print(name + ",");
        }
    }
}
