package testcontroller

data class RequestInfo(
    val headers: Map<String, String>,
    val params: Map<String, String>,
    val method: String,
    val url: String
)