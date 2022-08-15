package za.co.sikabopha.zapper.data.source;

import retrofit2.http.GET;

public interface NewsApi {
    String BASE_URL = "";

    @GET("getNews")
    void getNews();
}
