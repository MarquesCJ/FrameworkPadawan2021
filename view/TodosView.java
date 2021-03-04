package view;

import controller.TodosController;
import model.TodosModel;
import java.util.List;

public class TodosView{

    //Método para imprimir a Lista retornada pelo Controller
    public void print( ){

        TodosController todos = new TodosController( );
        List<TodosModel> listTodos  = todos.getTodos();

        for(int i = 0; i < listTodos.size(); i++){

            System.out.println(listTodos.get(i));

        }//fim for

    }//fim print

}//fim TodosView