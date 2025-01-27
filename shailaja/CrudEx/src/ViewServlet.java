import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)   
            throws ServletException, IOException {  
     response.setContentType("text/html");  
     PrintWriter out=response.getWriter();  
     out.println("<a href='index.html'>Add New Employee</a>");  
     out.println("<h1>Employees List</h1>");  
     List<Emp> list=EmpDao.getAllEmployees();  
     
     out.print("<table border='1' width='100%'");  
     out.print("<tr><th>Name</th><th>Password</th><th>Email</th><th>Country</th></tr>");  
     for(Emp e:list){  
      out.print("<tr><td>"+e.getName()+"</td><td>"+e.getPassword()+"</td><td>"+e.getEmail()+"</td><td>"+e.getCountry()+"</td></tr>");  
     }  
     out.print("</table>");  
     out.close();
    }
}
