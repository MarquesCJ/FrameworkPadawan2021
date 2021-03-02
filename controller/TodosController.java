package controller;

import model.TodosModel;

public class TodosController{

    TodosModel todos = new TodosModel( );

    public TodosModel criarTodos( ){

        todos.setId(1);
        todos.setUserId(1);
        todos.setTitle("delectus aut autem");
        todos.setCompleted(false);

        return todos;

    }//fim criarTodos

}//fim class