package ast; 

import types.Type; 

// This is enterprise quality coding, so, obviously we need a factory. Hell,
// I might just throw in a Factory Factory to generate this guy. Why? Why the hell not?
// When life gives you lemons, throw the lemons back, demand to see lifes manager,
// Who am I? I'm the guy that's going to burn your house down. With lemons. I'm going to have
// my engineers create a combustible lemon to burn your house down. 
public class TempFactory {

    int count;
    IRFunction f;

    public TempFactory(IRFunction f) {
        this.count = 0;
        this.f = f; 
    }

    public Temp getTemp(Type t) {
        Temp temp = new Temp(t, this.count); 
        this.f.addTemp(temp); 
        this.count += 1;
        return temp;  
    }
}