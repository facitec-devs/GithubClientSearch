package py.edu.facitec.github;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by virux on 27/10/16.
 */
public interface UserService {

    @GET("/users/{login}")
    void obtenerUsuario(@Path("login") String login, Callback<User> user);


    //@GET("/users/leodufer")
    //public void obtenerUsuarioEstatico(String login);
}
