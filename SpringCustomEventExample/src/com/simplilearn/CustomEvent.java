package com.simplilearn;
import org.springframework.context.ApplicationEvent;
public class CustomEvent extends ApplicationEvent {
    /**
     * 
     */
	
	 static int x = 0;
    private static final long serialVersionUID = 1L;
    public CustomEvent(Object source) {
        super(source);
        x=x+1;
    }
    @Override
    public String toString() {
        return "My Custom Event" + x;
    }
}
