package ramizbek.aliyev.chatapp

import java.io.Serializable

class Message : Serializable{
    var message:String? = null
    var senderId:String? = null

    constructor()

    constructor(message: String?, senderId: String?) {
        this.message = message
        this.senderId = senderId
    }

}