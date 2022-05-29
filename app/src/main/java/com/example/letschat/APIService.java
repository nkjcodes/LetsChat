package com.example.letschat;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA5Ufr_D0:APA91bEx6hkucFZYBhyZM7NclgdmsE8thiWdXojVuCx9iy9GV6YMn5zWAgy8dWDiEpvxZP6ULPRK2YTR--N1hM1rG7hdkuydr76r97ruotdo7do7khgKpVU"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
