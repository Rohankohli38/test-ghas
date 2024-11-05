import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VulnerableServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userInput = request.getParameter("input"); // Vulnerable to XSS
        PrintWriter out = response.getWriter();
        // Vulnerable output
        out.println("<html><body>User input: " + userInput + "</body></html>");
    }
}
