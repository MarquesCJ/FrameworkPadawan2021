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

    private List<AlbumsModel> setGson(String album) {

        Type lista = new TypeToken<List<AlbumsModel>>(){
        }.getType();

        return new Gson( ).fromJson(album , lista);

    }//fim setGson

    public List<AlbumsModel> getAlbums( ) {

        ArrayList<AlbumsModel> albums = new ArrayList<>();
        String fullAlbums = request.buscaApi("albums");

        albums.addAll(setGson(fullAlbums));

        return albums;

    }//fim getAlbums

}//fim class