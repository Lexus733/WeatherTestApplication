package com.example.myapplication.other

import android.content.Context
import com.example.myapplication.data.model.Records
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException
import java.io.InputStream
import java.lang.reflect.Type

object Utils {
    fun getJsonFromAssets(context: Context, fileName: String): String {
        val jsonString: String = try {
            val inputStream: InputStream = context.assets.open(fileName)
            val size: Int = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            String(buffer, Charsets.UTF_8)
        } catch (e: IOException) {
            e.printStackTrace()
            return ""
        }
        return jsonString
    }

    fun getDataFromJson(context: Context): Records {
        val jsonFileString: String =
            getJsonFromAssets(context, "owm_city_list.json")
        val gson = Gson()
        val listUserType: Type = object : TypeToken<Records>() {}.type
        return gson.fromJson(jsonFileString, listUserType)
    }
}