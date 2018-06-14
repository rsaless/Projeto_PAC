package classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class teste {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("..\\..\\..\\web\\json\\json100.json");

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            // obtendo a lista
            JSONObject lista = (JSONObject) jsonObject.get("lista");
            
            // obtendo os alunos 
            JSONArray alunos = (JSONArray) lista.get("aluno");
            
            // varrer o vetor item por item
            Iterator i = alunos.iterator();
            while (i.hasNext()) {
                JSONObject aluno = (JSONObject) i.next();
                System.out.println("Nome: "+ aluno.get("nome")); 
                System.out.println("Email: " + aluno.get("email"));
                System.out.println("RA: " + aluno.get("ra"));
            }
        } 
        
        catch (FileNotFoundException ex) { ex.printStackTrace();} 
        catch (IOException ex) { ex.printStackTrace(); } 
        catch (ParseException ex) { ex.printStackTrace();} 
        catch (NullPointerException ex) { ex.printStackTrace();}
        
    }
}
