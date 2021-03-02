package view;

import controller.PostagensController;

public class PostagensView{

    PostagensController post = new PostagensController();

    public void print( ){

        System.out.println(post.criarPost());

    }//fim print

}//fim class