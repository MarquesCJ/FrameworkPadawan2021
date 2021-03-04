package view;

import controller.PostagensController;
import model.PostagensModel;

import java.util.List;

public class PostagensView{

    PostagensController post = new PostagensController();

    //Método para imprimir a Lista retornada pelo Controller
    public void print( ){

        PostagensController posts = new PostagensController();
        List<PostagensModel> listPosts  = posts.getPosts();

        for(int i = 0; i < listPosts.size(); i++){

            System.out.println(listPosts.get(i));

        }//fim for

    }//fim print

}//fim class