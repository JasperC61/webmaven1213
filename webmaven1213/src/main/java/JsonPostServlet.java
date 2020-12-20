

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Student;


@WebServlet("/JsonPostServlet")
public class JsonPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public JsonPostServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sData=request.getParameter("stu");
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Gson gson = builder.create();
		Student student = gson.fromJson(sData, Student.class);
		System.out.println(student);
		//jsonString = gson.toJson(student);
		//System.out.println(jsonString);
		response.getWriter().append("Served at: ").append(student.toString());
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
