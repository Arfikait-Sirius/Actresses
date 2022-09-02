package actresses.girls

object Tina {
    private val LABEL_GIRLS_NAME = "[GIRLS-NAME]: "
    private val LABEL_TARGET = "[    TARGET]: "
    private val LABEL_JUDGE = "[     JUDGE]: "
    private val LABEL_PRINT = "[     PRINT]: "

    private var girlName = ""
    private var skillName = ""

    /** ----------------------
     * :[ NAME ]:
     *     fnSetGirlName
     *
     * :[ CATEGORY ]:
     *     Skill
     * -------------------- */
    fun fnSetGirlName( name: String ): Unit {
        girlName = name

        println( "$LABEL_GIRLS_NAME$girlName" )

        return
    }

    /** ----------------------
     * :[ NAME ]:
     *     fnSetSkillName
     *
     * :[ CATEGORY ]:
     *     Skill
     * -------------------- */
    fun fnSetSkillName( target: String ): Unit {
        skillName = target

        println( "$LABEL_TARGET$skillName" )

        return
    }

    /** ----------------------
     * :[ NAME ]:
     *     fnJudge
     *
     * :[ CATEGORY ]:
     *     Skill
     * -------------------- */
    fun fnJudge( judgement: Boolean ): Unit {
        
        if( judgement ){
            println( "${LABEL_JUDGE}OK" )
        } else {
            println( "${LABEL_JUDGE}NG - Please check $skillName" )
        }

        return
    }
}
