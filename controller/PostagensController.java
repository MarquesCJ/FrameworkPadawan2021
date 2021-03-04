package controller;

import com.google.gson.reflect.TypeToken;
import model.PostagensModel;
import network.Request;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

public class PostagensController{

    PostagensModel post = new PostagensModel( );
    Request request = new Request( );
    Gson gson = new Gson( );

    //Método responsável traduzir JSON para objeto
    private List<PostagensModel> setGson(String post) {

        Type lista = new TypeToken<List<PostagensModel>>(){
        }.getType();

        return new Gson( ).fromJson(post , lista);

    }//fim setGson

    //Método que cria a Lista e a retorna para o View
    public List<PostagensModel> getPosts( ) {

        ArrayList<PostagensModel> posts = new ArrayList<>();
        String fullPosts = request.buscaApi("posts");

        posts.addAll(setGson(fullPosts));

        return posts;

    }//fim getPosts

}//fim class