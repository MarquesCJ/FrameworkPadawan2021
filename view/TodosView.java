package view;

import controller.TodosController;

public class TodosView{

    TodosController todos = new TodosController( );

    public void print( ){

        System.out.println(todos.criarTodos( ));

    }//fim print

}//fim TodosView