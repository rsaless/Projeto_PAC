package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCelsiusFahrenheit extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void destroy() {
    }

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String minValue;
        String maxValue;
        String incValue;

        int min = -100;
        int max = 100;
        int inc = 5;
        double fahr;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        out.println("<html>");
        out.println("<head>");
        out.println("<title>Celsius-Fahrenheit</title>");
        out.println("</head>");
        out.println("<body>");

        minValue = request.getParameter("min");
        if (minValue != null && minValue.length() > 0) {
            min = Integer.parseInt(minValue);
        }

        maxValue = request.getParameter("max");
        if (maxValue != null && maxValue.length() > 0) {
            max = Integer.parseInt(maxValue);
        }

        incValue = request.getParameter("inc");
        if (incValue != null && incValue.length() > 0) {
            inc = Integer.parseInt(incValue);
        }

        out.println("<table border = \"border\">");
        out.println("<tr>");
        out.println("\t <th> <h4> Celsius </h4> </th>");
        out.println("\t <th> <h4> Fahrenheit </h4> </th>");
        out.println("</tr>");

        for (int celsius = min; celsius <= max; celsius += inc) {
            fahr = 9.0 / 5.0 * celsius + 32;
            out.println("<tr>");
            out.println("\t <th> <h5> " + celsius + "</h5> </th>");
            out.println("\t <th> <h5> " + fahr + "</h5> </th>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("get");
        processRequest(request, response);
    }

    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
}
