<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<html>
    <head><title>Celsius-Fahrenheit</title></head>
    <body>
        <%
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
        %>
    </body>
</html>
