package com.example.appexample1.utils

/**
 * Author: Eric Torres Jara
 * Date: 5/6/2025
 * The purpose of this class is centralize constant values, and avoid duplicate values
 */

object Constants {

    // API
    const val BASE_URL = "https://api.ejemplo.com/"
    const val TIMEOUT_IN_SECONDS = 30L

    // SharedPreferences
    const val PREFS_NAME = "my_app_prefs"
    const val KEY_USER_ID = "key_user_id"
    const val KEY_TOKEN = "key_token"

    // Intent Extras
    const val EXTRA_USER_ID = "extra_user_id"

    // Database
    const val DB_NAME = "app_database.db"
    const val DB_VERSION = 1

    // General
    const val DEFAULT_LANGUAGE = "es"
    const val DATE_FORMAT = "yyyy-MM-dd"

    // Endpoints
    object Endpoints {
        const val LOGIN = "auth/login"
        const val REGISTER = "auth/register"
        const val USERS = "users"
    }

    // Error codes
    object ErrorCodes {
        const val NETWORK_ERROR = 100
        const val AUTH_FAILED = 401
        const val UNKNOWN_ERROR = 999
    }

}