package finalproject.abrayudhistira.service

import finalproject.abrayudhistira.model.JenisProperti
import finalproject.abrayudhistira.model.Pemilik
import finalproject.abrayudhistira.model.Properti
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface PemilikService {
    @Headers(
        "Accept: application/json",
        "Content-Type: application/json",
    )
    // API FOR ENTITY JENIS PROPERTI
    @GET("getbyidPemilik.php/{id_pemilik}")
    suspend fun getbyidPemilik(@Query("id_pemilik")idPemilik: Pemilik): Pemilik //GET BY ID

    @POST("insertPemilik.php")
    suspend fun insertPemilik(@Body idPemilik: Pemilik) // INSERT PROPERTI

    @PUT("editPemilik.php")
    suspend fun editPemilik(@Query("id_pemilik")idPemilik: Pemilik, @Body pemilik: Pemilik) // EDIT PROPERTI

    @DELETE("deletePemilik.php/{id_pemilik}")
    suspend fun deletePemilik(@Query("id_pemilik")idPemilik: Pemilik): Response<Void> //DELETE PROPERTI
}