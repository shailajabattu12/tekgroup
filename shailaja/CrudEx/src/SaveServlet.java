import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveServlet extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
            throws ServletException, IOException {  
           response.setContentType("text/html");  
           PrintWriter out=response.getWriter();  
           //String id=request.getParameter("id");
           String name=request.getParameter("name");  
           String password=request.getParameter("password");  
           String email=request.getParameter("email");  
           String country=request.getParameter("country"); 
           Emp e= new Emp();
         //  e.setId(id);
           e.setName(name);
           e.setPassword(password);
           e.setEmail(email);
           e.setCountry(country);
           
           
           int status =EmpDao.save(e);
           if(status>0)
           {
        	   out.println("<P>record saved successfully</p>");
        	   request.getRequestDispatcher("index.html").include(request,response);
        	  
        	   
        	   
           }
           else
           {
        	   out.println("unable to save record");
           }
           
        out.close();   
    
    }
   }
    
             
