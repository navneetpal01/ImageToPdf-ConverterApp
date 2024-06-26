package com.example.imagetopdf_app.domain.repository

import android.graphics.Bitmap
import android.net.Uri


interface ImageToPdfRepository{

    fun convertUriToBitmap(uri : Uri) : Bitmap?

    fun convertMultipleUriToBitmap(uri : List<Uri>) : List<Bitmap>

    fun convertImageToPdf(bitmap: Bitmap)
    fun convertMultipleImagesToPdf(list : List<Bitmap>)

    fun getAllPdfAsMap() : Map<String,Uri>

}