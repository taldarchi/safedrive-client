package com.segeval.safedrive.model.Network;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface DriverService {

    @Headers("Content-Type: application/json")
    @POST("drivers/{id}/insert_driving_data/")
    Call<Void> createDrivingData(@Path("id") int ID, @Body String drivingData);

    @Headers("Content-Type: application/json")
    @POST("users/")
    Call<NetworkManager.UserCredentials> registerDriver(@Body NetworkManager.UserRegister  credentials);


    @POST("user-log-in/")
    Call<NetworkManager.UserCredentials> loginDriver();
}
