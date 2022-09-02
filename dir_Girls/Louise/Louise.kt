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
