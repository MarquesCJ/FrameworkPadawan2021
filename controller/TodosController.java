package controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.TodosModel;
import network.Request;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class TodosController{

    TodosModel todos = new TodosModel( );
    Request request = new Request( );
    Gson gson = new Gson( );

    //Método responsável traduzir JSON para objeto
    private List<TodosModel> setGson(String todos){

        Type lista = new TypeToken<List<TodosModel>>(){
        }.getType();

        return new Gson( ).fromJson(todos , lista);

    }//fim setGson

    //Método que criar a Lista e a retorna para o View
    public List<TodosModel> getTodos( ){

        ArrayList<TodosModel> todos = new ArrayList<>();
        String fullTodos = request.buscaApi("todos");

        todos.addAll(setGson(fullTodos));

        return todos;

    }//fim getPosts

}//fim class