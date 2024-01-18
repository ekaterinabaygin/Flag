package com.ekaterinabaygin.flag

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface FlagApiService {
    @GET("{countryCode}.png")
    fun getFlag(@Path("countryCode") countryCode: String): Call<ResponseBody>
}
