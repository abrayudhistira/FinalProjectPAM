package finalproject.abrayudhistira.service

import finalproject.abrayudhistira.model.ManajerProperti
import finalproject.abrayudhistira.model.Pemilik
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface ManajerPropertiService {
    @Headers(
        "Accept: application/json",
        "Content-Type: application/json",
    )
    // API FOR ENTITY MANAJER PROPERTI
    @GET("getbyidManajerProperti.php/{id_manajer}")
    suspend fun getbyidManajerProperti(@Query("id_manajer")idManajer: ManajerProperti): ManajerProperti //GET BY ID

    @POST("insertManajerProperti.php")
    suspend fun insertManajerProperti(@Body idManajer: ManajerProperti) // INSERT PROPERTI

    @PUT("editManajerProperti.php")
    suspend fun editManajerProperti(@Query("id_manajer")idManajer: ManajerProperti, @Body manajerProperti: ManajerProperti) // EDIT PROPERTI

    @DELETE("deleteManajerProperti.php/{id_manajer}")
    suspend fun deleteManajerProperti(@Query("id_manajer")idManajer: ManajerProperti): Response<Void> //DELETE PROPERTI
}