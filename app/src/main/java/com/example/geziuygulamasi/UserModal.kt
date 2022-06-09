package com.example.geziuygulamasi

import com.google.firebase.database.Exclude
import com.google.firebase.database.IgnoreExtraProperties


data class UserModal(
    var email: String? = "",
    var comment: String? = "",
    var rating: Float? = null,
    var index: String? = ""
    )
