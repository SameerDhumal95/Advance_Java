package study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//this instruction gives to constructor
@WebServlet(value = "/Life",loadOnStartup = -1)//property = 1 on -1 off
public class LifecycleExample extends HttpServlet {
	
    public LifecycleExample() {
        
    	System.out.println("Constructor of Lifecycle Ex called");
    }

    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
    	
    	System.out.println("Service method is called");
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("doGET of Lifecycle ex called");
	}

	@Override
	public void init() throws ServletException {
		
		System.out.println("init method called in lifecycleex");
	}	
		
	@Override
	public void destroy() {
	System.out.println("Destroy method called in lifecycle");
	}
	
	

}
