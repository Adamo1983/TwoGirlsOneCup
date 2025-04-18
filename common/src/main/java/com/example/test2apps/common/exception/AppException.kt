package com.example.test2apps.common.exception

sealed class AppException : Exception() {
    data class NetworkException(override val message: String) : AppException()
    data class AuthenticationException(override val message: String) : AppException()
    data class ValidationException(override val message: String) : AppException()
    data class UnknownException(override val message: String) : AppException()
} 