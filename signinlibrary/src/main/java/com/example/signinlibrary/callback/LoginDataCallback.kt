package com.example.signinlibrary.callback

import com.example.signinlibrary.model.LoginDataModel
import java.io.Serializable

interface LoginDataCallback:Serializable {
    fun userData(loginDataModel: LoginDataModel)
}