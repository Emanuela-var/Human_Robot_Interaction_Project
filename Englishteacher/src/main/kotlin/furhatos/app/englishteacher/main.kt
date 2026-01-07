package furhatos.app.englishteacher

import furhatos.app.englishteacher.flow.Introduction
import furhatos.flow.kotlin.Flow
import furhatos.skills.Skill

class EnglishteacherSkill : Skill() {
    override fun start() {
        Flow().run(Introduction)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
