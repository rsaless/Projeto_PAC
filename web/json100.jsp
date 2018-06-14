<%@page import="java.util.Iterator"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.parser.JSONParser"%>
<%@page import="java.io.FileReader"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    String url = "C:\\Users\\rafap\\OneDrive\\Documents\\NetBeansProjects\\Projeto_PAC\\json\\dados100sf.json";
    FileReader reader = new FileReader(url); 

    JSONParser jsonParser = new JSONParser();
    JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

    // obtendo a lista
    JSONObject lista = (JSONObject) jsonObject.get("lista");

    // obtendo os alunos 
    JSONArray alunos = (JSONArray) lista.get("aluno");

    // varrer o vetor item por item
    Iterator i = alunos.iterator();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSON 100</title>
    </head>
    <body>
        <% while (i.hasNext()) { 
            JSONObject aluno = (JSONObject) i.next();%>
            <p>Nome: <%= aluno.get("nome") %> </p> 
            <p>Email: <%= aluno.get("email") %> </p>
            <p>RA: <%= aluno.get("ra") %> </p>
            <hr>
        <% } %>
    </body>
</html>