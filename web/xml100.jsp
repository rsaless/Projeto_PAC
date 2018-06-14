<%@page import="org.w3c.dom.Node"%>
<%@page import="org.w3c.dom.Element"%>
<%@page import="org.w3c.dom.NodeList"%>
<%@page import="javax.xml.parsers.DocumentBuilderFactory"%>
<%@page import="org.w3c.dom.Document"%>
<%@page import="javax.xml.parsers.DocumentBuilder"%>
<%@page import="java.io.File"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
String url = "C:\\Users\\rafap\\OneDrive\\Documents\\NetBeansProjects\\Projeto_PAC\\xml\\dados100sf.xml";
            //abre o arquivo, lê o XML e normaliza ele
            File file = new File(url);
            DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
        
            //acessa a lista de alunos
            NodeList nList = doc.getElementsByTagName("aluno");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="cards.css">
        <title>XML 100</title>
    </head>
    <body>
        <%for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;%>
                <div class="card">
                    <img src="img_avatar.png" alt="Avatar" width="200px" height="200px">
                    <div class="card_container">
                        <h4><b><%= eElement.getElementsByTagName("nome").item(0).getTextContent() %></b></h4> 
                        <p><%= eElement.getElementsByTagName("email").item(0).getTextContent() %></p> 
                        <p>RA: <%= eElement.getElementsByTagName("ra").item(0).getTextContent() %> </p>
                    </div>
                </div>
            <% }
        }%>
    </body>
</html>
