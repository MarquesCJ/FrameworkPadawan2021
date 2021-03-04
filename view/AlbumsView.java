package view;

import controller.AlbumsController;
import model.AlbumsModel;
import java.util.List;

public class AlbumsView{

    //Método para imprimir a Lista retornada pelo Controller
    public void print( ){

        AlbumsController albums = new AlbumsController();
        List<AlbumsModel> listAlbums  = albums.getAlbums();

        for(int i = 0; i < listAlbums.size(); i++){

            System.out.println(listAlbums.get(i));

        }//fim for

    }//fim print

}//fim AlbumsView