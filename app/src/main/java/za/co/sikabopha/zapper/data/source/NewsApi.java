package za.co.sikabopha.zapper.data.source;

import java.util.List;

import retrofit2.http.GET;
import za.co.sikabopha.zapper.data.dto.NewsDTO;

public interface NewsApi {
    String BASE_URL = "";

    @GET("getNews")
    List<NewsDTO> getNews();
}
