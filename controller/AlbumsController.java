package controller;

import model.AlbumsModel;

public class AlbumsController{

    AlbumsModel album = new AlbumsModel( );

    public AlbumsModel criarAlbum( ){

        album.setUserId(1);
        album.setId(1);
        album.setTitle("quidem molestiae enim");

        return album;

    }//fim criarAlbum

}//fim class