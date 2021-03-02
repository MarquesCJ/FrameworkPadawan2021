package model;

public class AlbumsModel{

    private int userId;
    private int id;
    private String title;

    public int getUserId( ){

        return userId;

    }//fim getUserId

    public void setUserId(int userId){

        this.userId = userId;

    }//fim setUserId

    public int getId( ){

        return id;

    }//fim getId

    public void setId(int id){

        this.id = id;

    }//fim setId

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
        "\ntitle: " + title + "\n";

    }//fim toString

}//fim class