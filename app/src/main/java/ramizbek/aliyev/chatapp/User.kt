package ramizbek.aliyev.chatapp

import java.io.Serializable

class User : Serializable{
    var name:String? = null
    var email:String? = null
    var uid:String? = null


    constructor()

    constructor(name: String?, email: String?, uid: String?) {
        this.name = name
        this.email = email
        this.uid = uid
    }
}


