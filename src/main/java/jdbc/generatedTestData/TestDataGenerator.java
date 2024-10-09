package jdbc.generatedTestData;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;


public class TestDataGenerator {

    @SuppressWarnings("all")
    public static String getResponse() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://community-open-weather-map.p.rapidapi.com/climate/month?q=San%20Francisco")
                .get()
                .addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "b5f5c31268mshffcb4a36f6c7777p1eb856jsn247f7613cfee")
                .build();

        Response response = client.newCall(request).execute();

        return response.body().string();
    }

    @SneakyThrows
    public static <T> T parse(String body, Class<T> cls) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(body, cls);
    }
}
