package network;

import util.Util;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Request{

   static String apiBase  = "https://jsonplaceholder.typicode.com/";

   //Método que acessa o JSON e a retorna em formato de String
    public String buscaApi(String endpoint){

        String postString = " ";

        try {

            URL url = new URL(apiBase + endpoint);

            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));

            postString = Util.converteJsonEmString(resposta);

        }catch(Exception e){

            System.out.println("Falha de requisição");

        }//end catch
        
        return postString;

    }//fim buscaPost

}//fim class