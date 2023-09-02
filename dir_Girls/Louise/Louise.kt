package actresses.girls

object Louise {

    /** ----------------------
     * :[ NAME ]:
     *     fnCopy
     *
     * :[ CATEGORY ]:
     *     Skill
     * -------------------- */
     fun fnCopy( base: String ): String {
          return base
     }

    /** ----------------------
     * :[ NAME ]:
     *     fnCount
     *
     * :[ CATEGORY ]:
     *     Skill
     * -------------------- */
     fun fnCount( base: String, target: String ): Int {
          var count = 0
          var index = base.indexOf( target )
          var s = base.substring( index + 1 )

          while( index != -1 ){
               count++
               index = s.indexOf( target )
               s = s.substring( index + 1 )
          }

          return count
     }

    /** ----------------------
     * :[ NAME ]:
     *     fnReplace
     *
     * :[ CATEGORY ]:
     *     Skill
     * -------------------- */
     fun fnReplace( base: String, target: String, replacement: String ): String {
          return base.replaceFirst( target, replacement )
     }

    /** ----------------------
     * :[ NAME ]:
     *     fnUpperAll
     *
     * :[ CATEGORY ]:
     *     Skill
     * -------------------- */
     fun fnUpperAll( base: String ): String {
          return base.uppercase()
     }

    /** ----------------------
     * :[ NAME ]:
     *     fnLowerAll
     *
     * :[ CATEGORY ]:
     *     Skill
     * -------------------- */
     fun fnLowerAll( base: String ): String {
          return base.lowercase()
     }

    /** ----------------------
     * :[ NAME ]:
     *     fnUpperFirst
     *
     * :[ CATEGORY ]:
     *     Skill
     * -------------------- */
     fun fnUpperFirst( base: String ): String {
          val baseUpper = base.uppercase().take( 1 )
          val baseLower = base.lowercase().takeLast( base.length - 1 )
          
          return "$baseUpper$baseLower"
     }
}
