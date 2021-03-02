package controller;

import model.PostagensModel;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostagensController{

    PostagensModel post = new PostagensModel( );
    
    public PostagensModel criarPost( ){
        
        post.setId(2);
        post.setUserId(3);
        post.setBody("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
        post.setTitle("sunt aut facere repellat provident occaecati excepturi optio reprehenderit");

        return post;

    }//fim void

}//fim class