package com.example.myapplication.data.model

data class Records(
    val RECORDS: List<RecordData>
)

data class RecordData(
    val owm_city_id: String,
    val owm_city_name: String,
    val owm_latitude: String,
    val owm_longitude: String,
    val owm_country: String,
    val locality_short: String,
    val locality_long: String,
    val admin_level_1_short: String,
    val admin_level_1_long: String,
    val admin_level_2_short: String,
    val admin_level_2_long: String,
    val admin_level_3_short: String,
    val admin_level_3_long: String,
    val admin_level_4_short: String,
    val admin_level_4_long: String,
    val admin_level_5_short: String,
    val admin_level_5_long: String,
    val country_short: String,
    val country_long: String,
    val postal_code: String
)

/*
{
    "RECORDS":[
    {
        "owm_city_id":"819827",
        "owm_city_name":"Razvilka",
        "owm_latitude":"55.591667",
        "owm_longitude":"37.740833",
        "owm_country":"RU",
        "locality_short":"Razvilka",
        "locality_long":"Razvilka",
        "admin_level_1_short":"МО",
        "admin_level_1_long":"Moskovskaya oblast'",
        "admin_level_2_short":"Leninsky District",
        "admin_level_2_long":"Leninsky District",
        "admin_level_3_short":"",
        "admin_level_3_long":"",
        "admin_level_4_short":"",
        "admin_level_4_long":"",
        "admin_level_5_short":"",
        "admin_level_5_long":"",
        "country_short":"RU",
        "country_long":"Russia",
        "postal_code":"142715"
    }
    ]
}
 */