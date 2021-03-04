package controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.AlbumsModel;
import network.Request;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AlbumsController{

    AlbumsModel album = new AlbumsModel( );
    Request request = new Request( );
    Gson gson = new Gson( );

    //Método responsável traduzir JSON para objeto
    private List<AlbumsModel> setGson(String album) {

        Type lista = new TypeToken<List<AlbumsModel>>(){
        }.getType();

        return new Gson( ).fromJson(album , lista);

    }//fim setGson

    //Método que criar a Lista e a retorna para o View
    public List<AlbumsModel> getAlbums( ) {

        ArrayList<AlbumsModel> albums = new ArrayList<>();
        String fullAlbums = request.buscaApi("albums");

        albums.addAll(setGson(fullAlbums));

        return albums;

    }//fim getAlbums

}//fim class