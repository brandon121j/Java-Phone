package Phones;

public interface Ringable {
    
    public default String ring() {
        return("Ring ring ring ring!");
    }

    public default String unlock() {
        return("Unlock successful");
    }

    
}

