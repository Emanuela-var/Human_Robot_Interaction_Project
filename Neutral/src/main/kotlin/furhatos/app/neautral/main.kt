package furhatos.app.neautral

import furhatos.app.neautral.flow.Introduction
import furhatos.flow.kotlin.Flow
import furhatos.skills.Skill

class NeautralSkill : Skill() {
    override fun start() {
        Flow().run(Introduction)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
