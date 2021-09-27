package szamologepservlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="mainservlet",urlPatterns="/masik")
public class servlet2 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ResultDto resultDto = new ResultDto();
		List<String> errorList = new ArrayList<String>();
		String aString =req.getParameter("a");
		Double a = 0.0;
		if(aString == null) {
			errorList.add("ez a paraméter nem lehet üres");
		}
		else {
			try {
				a=Double.parseDouble(aString);
			}
			catch (NumberFormatException ex) {
				errorList.add("az a parameter szam kell legyen");
			}
		}
		resultDto.setA(aString);
		String bString =req.getParameter("b");
		if(bString == null) {
			errorList.add("ez a paraméter nem lehet üres");
		}
		else {
			try {
				b=Double.parseDouble(bString);
			}
			catch (NumberFormatException ex) {
				errorList.add("a b parameter szam kell legyen");
			}
		}
		resultDto.setB(bString);
		String operator =req.getParameter("operator");
		resultDto.setOperator(operator);
		
		if (operator == null) {
			errorList.add("az operator parameter nem lehet üres");
		}
		
		Double result = 0.0;
		if (errorList.isEmpty()) {
		if("+".equals(operator)) {
			result = a+b;
		}
		else {
			errorList.add("nem tamogatott művelet");
		}
		}
		resultDto.setResult(result);
		resultDto.setErrorList(errorList);
		//eltároljuk kérés attributumban az összes infot, hogy a jsp elérést
		req.setAttribute("result", result);
		
		//forward
		RequestDispatcher rd = req.getSession().getServletContext().getRequestDispatcher("/");
		rd.forward(req, resp);
		
		
		resp.getWriter().println("hi from servlet2!");
	}

}
