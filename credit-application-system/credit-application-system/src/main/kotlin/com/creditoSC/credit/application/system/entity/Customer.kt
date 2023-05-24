package com.creditoSC.credit.application.system.entity


data class Customer(
        var fisrtName:String = "",
        var lastName:String = "",
        val cpf:String = "",
        var email:String  = "",
        var password:String = "",
        var adress:Address = Address(),
        var credits: List<Credit> = mutableListOf(),
        val id:Long?=null //after the JPG will complete that
){

}
