package actresses.girls

object Louise {
     fun fnUpperAll( base: String ): String {
          return base.toUpperCase()
     }

     fun fnLowerAll( base: String ): String {
          return base.toLowerCase()
     }

     fun fnUpperFirst( base: String ): String {
          val baseLower = base.toLowerCase().takeLast( base.length - 1 )
          val baseUpper = base.toUpperCase().take( 1 )
          return "$baseUpper$baseLower"
     }
}
