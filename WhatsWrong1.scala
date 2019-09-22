package com.particeep.test

object WhatsWrong1 {

  trait Interface {
    val city: String
    val support: String = s"Ici c'est $city !"
  }

  case object Supporter extends Interface {

    override val city = "Paris"
    override val support: String = s"Ici c'est $city !"
  }

  Supporter.city //Paris
  Supporter.support //Ici c'est null we just need to override the val support again to get Ici c'est Paris
}
