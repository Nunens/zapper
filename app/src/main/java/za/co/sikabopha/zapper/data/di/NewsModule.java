package za.co.sikabopha.zapper.data.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import za.co.sikabopha.zapper.data.repository.NewsRepositoryImpl;
import za.co.sikabopha.zapper.data.source.NewsApi;
import za.co.sikabopha.zapper.domain.repository.NewsRepository;

@Module
@InstallIn(SingletonComponent.class)
public class NewsModule {

    @Provides
    @Singleton
    NewsApi proviceNewsApi(){
        return new Retrofit.Builder()
                .baseUrl(NewsApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(NewsApi.class);
    }

    @Provides
    @Singleton
    NewsRepository provideNewsRepository(NewsApi api){
        return new NewsRepositoryImpl(api);
    }


}
