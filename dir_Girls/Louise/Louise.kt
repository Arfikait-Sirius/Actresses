package actresses.girls

object Louise {
     fun fnUpperAll( base: String ): String {
          return base.uppercase()
     }

     fun fnLowerAll( base: String ): String {
          return base.lowercase()
     }

     fun fnUpperFirst( base: String ): String {
          val baseUpper = base.uppercase().take( 1 )
          val baseLower = base.lowercase().takeLast( base.length - 1 )
          return "$baseUpper$baseLower"
     }
}
