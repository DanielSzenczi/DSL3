//Generated by dasze18
package math_expression;

import java.util.*;

public class Test27 {
	
//Attributes
public int x;
public int y;

private External external;

    
//Constructor
public Test27(External external) { 
	this.external = external;
}
	
	
//Compute
public void compute() {
    this.x = this.external.pi();
    this.y = x + 2;
}

//Interface
interface External { 
    public int pi();
} 

}