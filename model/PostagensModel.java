package model;

public class PostagensModel{

    private int id;
    private int userId;
    private String title;
    private String body;

    public int getId( ){

        return id;

    }//fim getId

    public void setId(int id){

        this.id = id;

    }//fim setId

    public int getUserId( ){

        return userId;

    }//fim getUserId

    public void setUserId(int userId){

        this.userId = userId;

    }//fim setUserId

    public String getbody( ){

        return body;

    }//fim getbody

    public void setBody(String body){

        this.body = body;

    }//fim setBody

    public String getTitle( ){

        return title;

    }//fim getTitle

    public void setTitle(String title){

        this.title = title;

    }//fim setTitle

    @Override
    public String toString( ){
        
        return "UserId: " +userId +
        "\nid: " + id + 
        "\ntitle: " + title +
        "\nbody: " + body +"\n";

    }//fim toString


}//fim class