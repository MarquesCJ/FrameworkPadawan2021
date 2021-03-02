package model;

public class TodosModel{

    private int id;
    private int userId;
    private String title;
    private boolean completed;

    public int getId( ){

        return id;

    }//fim getId;

    public void setId(int id){

        this.id = id;

    }//fim setId

    public int getUserId( ){

        return userId;

    }//fim getUserId

    public void setUserId(int userId){

        this.userId = userId;

    }//fim setUserId

    public String getTitle( ){

        return title;

    }//fim getTitle

    public void setTitle(String title){

        this.title = title;

    }//fim setTitle

    public boolean getCompleted( ){

        return completed;

    }//fim getCompleted

    public void setCompleted(boolean completed){

        this.completed = completed;

    }//fim setCompleted

    @Override
    public String toString( ){
        
        return "UserId: " +userId +
        "\nid: " + id + 
        "\ntitle: " + title +
        "\ncompleted: " + completed +"\n";

    }//fim toString

}//fim class