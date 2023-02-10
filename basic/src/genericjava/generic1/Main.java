package genericjava.generic1;

  
class Data {
    
    private Object element;

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }
}

public class Main {

    public static void main(String[] args) {

        
        Data dataA = new Data();
        Integer myInt = 100;
        dataA.setElement(myInt);

        Data dataB = new Data();
        String myString = "John";
        dataB.setElement(myString);
       
        // Integer returnValue=dataB.getElement();
        
        Integer returnValue = (Integer) dataB.getElement();
      
    }
}
