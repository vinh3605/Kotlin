package enums

enum class RequestError(val message : String) {
        BAD_REQUEST("INVALID REUEST"),
        INTERNAL_ERORR("Internal sever Erorr"),
        SUCESS("Sever process request succesfully")


}