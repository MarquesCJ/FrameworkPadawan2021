package view;

import controller.AlbumsController;

public class AlbumsView{

    AlbumsController album = new AlbumsController( );

    public void print( ){

        System.out.println(album.criarAlbum());

    }//fim print

}//fim AlbumsView