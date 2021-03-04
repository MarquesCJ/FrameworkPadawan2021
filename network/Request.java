package network;

import com.google.gson.Gson;
import util.Util;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Request{

   static String apiBase  = "https://jsonplaceholder.typicode.com/";

    public String buscaApi( String endpoint ){

        String postString = " ";

        try {

            URL url = new URL(apiBase + endpoint);

            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));

            postString = Util.converteJsonEmString(resposta);

        }catch(Exception e){

            System.out.println("Erro");

        }//fim catch

        return postString;

    }//fim buscaPost

}//fim class