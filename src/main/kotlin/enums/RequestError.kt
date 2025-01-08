package enums

enum class RequestError(val message : String) {
        BAD_REQUEST("INVALID REUEST"),
        INTERNAL_ERROR("Internal sever Erorr"),
        SUCCESS("Sever process request succesfully");

        //you can define more methods string
        fun wordCount() = message.trim().split("\\s+".toRegex()).size
}
