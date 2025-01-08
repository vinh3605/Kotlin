package models

 data class User(val id: Int, var name:String, var email:String) {
  //you can also which properties "equal", override
  override fun equals(other: Any?): Boolean {
   // other is User mục đích là other là kiểu dữ liệu bất kì, thì khi mà
   //so sánh thì đúng user mới  nhận
   return other is User
           && this.id==other.id
           && this.name==other.name
  }

  //****
  //you can also rewrite the hascode method
  override fun hashCode(): Int {
   return id + name.hashCode() + email.hashCode()
  }


}