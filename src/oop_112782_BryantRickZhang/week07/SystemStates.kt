package oop_112782_BryantRickZhang.week07

enum class AppState {
    IDLE,
    LOADING,
    SUCCESS,
    ERROR
}

sealed class ApiResponse {
    object Loading : ApiResponse()
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
}