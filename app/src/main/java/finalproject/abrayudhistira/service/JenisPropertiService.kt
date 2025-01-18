package finalproject.abrayudhistira.service

import finalproject.abrayudhistira.model.JenisProperti
import finalproject.abrayudhistira.model.Properti
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface JenisPropertiService {
    @Headers(
        "Accept: application/json",
        "Content-Type: application/json",
    )
    // API FOR ENTITY JENIS PROPERTI
    @GET("getbyidJenisProperti.php/{id_jenis}")
    suspend fun getMahasiswaByidJenis(@Query("id_jenis")idJenisProperti: JenisProperti): JenisProperti //GET BY ID

    @POST("insertJenisProperti.php")
    suspend fun insertJenisProperti(@Body jenisProperti: JenisProperti) // INSERT PROPERTI

    @PUT("editJenisProperti.php")
    suspend fun editJenisProperti(@Query("id_jenis")idProperti: Properti, @Body jenisProperti: JenisProperti) // EDIT PROPERTI

    @DELETE("deleteJenisProperti.php/{id_jenis}")
    suspend fun deleteJenisProperti(@Query("id_jenis")idProperti: Properti): Response<Void> //DELETE PROPERTI
}