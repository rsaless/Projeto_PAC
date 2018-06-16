<%@page import="java.util.Iterator"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.parser.JSONParser"%>
<%@page import="java.io.FileReader"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    String url = "json\\dados10000sf.json";
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
        <link rel="stylesheet" type="text/css" href="cards.css">
        <title>JSON 10K</title>
    </head>
    <body>
        <% while (i.hasNext()) { 
            JSONObject aluno = (JSONObject) i.next();%>
            <div class="card">
              <img src="img_avatar.png" alt="Avatar" width="200px" height="200px">
              <div class="card_container">
                <h4><b><%= aluno.get("nome") %></b></h4> 
                <p><%= aluno.get("email") %></p> 
                <p>RA: <%= aluno.get("ra") %> </p>
              </div>
            </div>
        <% } %>
    </body>
</html>