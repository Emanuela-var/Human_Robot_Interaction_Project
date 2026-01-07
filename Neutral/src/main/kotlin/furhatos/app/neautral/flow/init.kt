package furhatos.app.neautral.flow

import furhatos.flow.kotlin.*


val Introduction: State = state {
    onEntry {
        furhat.say("Ciao. Mi chiamo Furhat. Oggi impareremo alcune parole in inglese. ")
        goto(Color)
    }
}

val Color: State = state {
    onEntry {
        furhat.say("Iniziamo con il primo esercizio.")
        goto(Campione)
    }
}

val Campione: State = state {
    onEntry {
        furhat.say("Ti dirò una parola in inglese e dovrai ripeterla dopo di me.")
        goto(WordRepetition)
    }
}

val WordRepetition: State = state {
    onEntry {
        furhat.say("La prima parola è ‘mela’. In inglese si dice ‘apple’. Ripeti: ‘apple’.")
        furhat.listen()
    }

    onResponse {
        val userInput = it.text.toLowerCase().trim()
        if (userInput == "apple") {
            furhat.say("Ok.")
            goto(First)
        } else {
            furhat.say("Errato!")
            reentry()
        }
    }
}

val First: State = state {
    onEntry {
        furhat.say("Passiamo alla prossima parola.")
        goto(NextWord)
    }
}

val NextWord: State = state {
    onEntry {
        furhat.say("‘Quadrato’ in inglese si dice ‘square’. Ripeti: ‘square’.")
        furhat.listen()
    }

    onResponse {
        val userInput = it.text.toLowerCase().trim()
        if (userInput == "square") {
            furhat.say("Giusto.")
            goto(Second)
        } else {
            furhat.say("Sbagliato.")
            reentry()
        }
    }
}

val Second: State = state {
    onEntry {
        furhat.say("Ora la parola da ripetere è ‘piccolo’.")
        goto(DayWord)
    }
}

val DayWord: State = state {
    onEntry {
        furhat.say("‘Piccolo’ in inglese si dice ‘small’. Ripeti: ‘small’.")
        furhat.listen()
    }

    onResponse {
        val userInput = it.text.toLowerCase().trim()
        if (userInput == "small") {
            furhat.say("ok!")
            goto(Third)
        } else {
            furhat.say("Errato.")
            reentry()
        }
    }
}

val Third: State = state {
    onEntry {
        furhat.say("Ora l'ultima parola.")
        goto(SmallWord)
    }
}

val SmallWord: State = state {
    onEntry {
        furhat.say("‘Notte’ in inglese si dice ‘night’. Ripeti: ‘night’.")
        furhat.listen()
    }

    onResponse {
        val userInput = it.text.toLowerCase().trim()
        if (userInput == "night") {
            furhat.say("Bene.")
            goto(Middle)
        } else {
            furhat.say("Sbagliato, riprova.")
            reentry()
        }
    }
}

val Middle: State = state {
    onEntry {
        furhat.say("Cambiamo esercizio, dovrai indovinare il contrario di una parola che ti dirò.")
        goto(OppositesGame)
    }
}

val OppositesGame: State = state {
    onEntry {
        furhat.say("‘Grande’ in inglese si dice ‘big’. Qual è il contrario di ‘big’?")
        furhat.listen()
    }

    onResponse {
        val userInput = it.text.toLowerCase().trim()
        if (userInput == "small") {
            furhat.say("ok")
            goto(Four)
        } else {
            furhat.say("Il contrario di ‘big’ è ‘small’. Riprova.")
            reentry()
        }
    }
}

val Four: State = state {
    onEntry {
        furhat.say("Passiamo alla prossima parola.")
        goto(Night)
    }
}

val Night: State = state {
    onEntry {
        furhat.say("'Giorno' in inglese si dice 'day'. Qual è il contrario di 'day'?")
        furhat.listen()
    }

    onResponse {
        val userInput = it.text.toLowerCase().trim()
        if (userInput == "night") {
            furhat.say("Va bene.")
            goto(Bad)
        } else {
            furhat.say("No, il contrario di 'day' è 'night'. Ritenta.")
            reentry()
        }
    }
}

val Bad: State = state {
    onEntry {
        furhat.say("Passiamo al  prossimo esercizio: completa una farase che ti dirò con una parola.")
        goto(Centre)
    }
}

val Centre: State = state {
    onEntry {
        furhat.say("Completa la frase: 'Il cielo è'. In inglese si dice: 'The sky is'. Pensa al colore del cielo e rispondi.")
        furhat.listen()
    }

    onResponse {
        val userInput = it.text.toLowerCase().trim()
        if (userInput == "blue") {
            furhat.say("ok")
            goto(Block)
        } else {
            furhat.say("No. La frase completa è: 'The sky is blue'. Riprova.")
            reentry()
        }
    }
}


val Block: State = state {
    onEntry {
        furhat.say(" Considera ora la frase: The sun is, che in italiano si traduce Il sole è. Completala, pensando al colore del sole.")
        furhat.listen()
    }

    onResponse {
        val userInput = it.text.toLowerCase().trim()
        if (userInput == "yellow") {
            furhat.say("ok")
            goto(Idle)
        } else {
            furhat.say("No, la frase completa è: The sun is yellow. Riprova.")
            reentry()
        }
    }
}

val Idle: State = state {
    onEntry {
        furhat.say("Abbiamo finito la lezione di oggi. Alla prossima.")
    }
}

