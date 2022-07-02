package com.example.dologinout

import com.google.gson.annotations.SerializedName

data class AuthResponse(
    @SerializedName(value = "isSuccess") val isSuccess:Boolean,
    @SerializedName(value = "code") val code:Int,
    @SerializedName(value = "message") val message:String,
    @SerializedName(value = "result") val result : Result?
    )

data class Result(
    @SerializedName(value = "userIdx") val userIdx : Int,
    @SerializedName(value = "jwt") val jwt : String
)
