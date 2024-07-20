package sit.sit2;

public class empoly extends person {
    public void displayinfo() {
        name();
        age();
        address();
        
        
    }
    
    public static void main(String[] args) {
    	empoly emp = new empoly();
        emp.displayinfo();
    }
}