package udb.ml161665dsm.dogapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("{raza}/images")
    Call<DogsResponse> getDogsByBreed(@Path("raza") String raza);
}
