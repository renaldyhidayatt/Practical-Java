package polymorphism.polymorphism7;

public class Cheque extends Payment {

    final int id;
    
    public Cheque(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public void pay() {
        System.out.println("Payment by Cheque completed");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!(obj instanceof Cheque)) return false;
        if (this.id == ((Cheque) obj).getId()) {
            return true;
        } else {
            return false;
        }
    }

}
