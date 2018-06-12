package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class conversao_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head><title>Celsius-Fahrenheit</title></head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String minValue;
            String maxValue;
            String incValue;

            int min = -100;
            int max = 100;
            int inc = 5;

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

            double fahr;

            out.println("<table border = \"1\">");
            out.println("<tr>");
            out.println("\t <th> <h4> Celsius </h4> </th>");
            out.println("\t <th> <h4> Fahrenheit </h4> </th>");
            out.println("</tr>");

            for (int celsius = min; celsius <= max; celsius+=inc) {
                fahr = 9/5.0 * celsius + 32;
                out.println("<tr>");
                out.println("\t <td> <h5> " + celsius + "</h5> </td>");
                out.println("\t <td> <h5> " + fahr    + "</h5> </td>");
                out.println("</tr>");
            }
            out.println("</table>");
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
