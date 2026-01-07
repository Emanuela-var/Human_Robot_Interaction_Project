package furhatos.app.englishteacher.flow

import furhatos.flow.kotlin.*
import furhatos.gestures.Gestures

val Introduction: State = state {
    onEntry {
        furhat.gesture(Gestures.BigSmile)
        furhat.say("Ciao! Mi chiamo Furhat. Spero che ti divertirai con me oggi, imparando nuove parole in inglese. Sei pronta? ")
        goto(Color)
    }
}

val Color: State = state {
    onEntry {
        furhat.gesture(Gestures.Wink)
        furhat.gesture(Gestures.BigSmile)
        furhat.say(" So che già sei bravissima e sono sicura che faremo un ottimo lavoro insieme! Partiamo con il primo esercizio. ")
        goto(Campione)
    }
}

val Campione: State = state {
    onEntry {
        furhat.gesture(Gestures.BigSmile)
        furhat.say(" Ti dirò una parola in inglese e dovrai ripeterla dopo di me. ")
        goto(WordRepetition)
    }
}

val WordRepetition: State = state {
    onEntry {
        furhat.gesture(Gestures.BigSmile)
        furhat.say("  La prima parola è ‘mela’. In inglese si dice ‘apple’. Ascolta bene: ‘apple’. Ora tocca a te, prova a ripeterla!")
        furhat.listen()
    }

    onResponse {
        val userInput = it.text.toLowerCase().trim()
        if (userInput == "apple") {
            furhat.gesture(Gestures.Surprise)
            furhat.gesture(Gestures.BigSmile)
            furhat.say("Bravissima! Hai detto ‘apple’ proprio bene! ")
            goto(First)
        } else {
            furhat.gesture(Gestures.BrowRaise)
            furhat.gesture(Gestures.Smile)
            furhat.say("Ci sei quasi! Riproviamo insieme, sono sicura che ce la farai!")
            reentry()
        }
    }
}

val First: State = state {
    onEntry {
        furhat.gesture(Gestures.BigSmile)
        furhat.say( " Andiamo alla prossima parola, ")
        goto(NextWord)
    }
}

val NextWord: State = state {
    onEntry {
        furhat.gesture(Gestures.BigSmile)
        furhat.say(" In inglese 'quadrato' si dice ‘square’. Ora ripeti con me: ‘square’. ")
        furhat.listen()
    }

    onResponse {
        val userInput = it.text.toLowerCase().trim()
        if (userInput == "square") {
            furhat.gesture(Gestures.Nod)
            furhat.gesture(Gestures.BigSmile)
            furhat.say("Stai facendo davvero un ottimo lavoro. Continua così! ")
            goto(Second)
        } else {
            furhat.gesture(Gestures.BrowRaise)
            furhat.gesture(Gestures.Smile)
            furhat.say("Non preoccuparti, sono sicura che ce la farai! ")
            reentry()
        }
    }
}

val Second: State = state {
    onEntry {
        furhat.gesture(Gestures.BigSmile)
        furhat.say(" Proviamo ora con la parola 'piccolo'. ")
        goto(DayWord)
    }
}

val DayWord: State = state {
    onEntry {
        furhat.say(" In inglese 'piccolo'  si dice ‘small’.  Ripeti con me: ‘small’.")
        furhat.listen()
    }

    onResponse {
        val userInput = it.text.toLowerCase().trim()
        if (userInput == "small") {
            furhat.gesture(Gestures.Surprise)
            furhat.gesture(Gestures.BigSmile)
            furhat.say("Grandioso! Mi stupisce molto la tua bravura! ")
            goto(Third)
        } else {
            furhat.gesture(Gestures.Smile)
            furhat.say("Non preoccuparti, sono sicura che riuscirai a dirlo correttamente! ")
            reentry()
        }
    }
}

val Third: State = state {
    onEntry {
        furhat.gesture(Gestures.Wink)
        furhat.gesture(Gestures.BigSmile)
        furhat.say(" Proviamo ora con l'ultima parola: ")
        goto(SmallWord)
    }
}

val SmallWord: State = state {
    onEntry {
        furhat.gesture(Gestures.BigSmile)
        furhat.say(" in inglese 'notte' si dice 'night'. Ripeti con me: 'night'. ")
        furhat.listen()
    }

    onResponse {
        val userInput = it.text.toLowerCase().trim()
        if (userInput == "night") {
            furhat.gesture(Gestures.Surprise)
            furhat.gesture(Gestures.BigSmile)
            furhat.say("Complimenti, la traduzione in inglese di notte è porprio 'night'!")
            goto(Middle)
        } else {
            furhat.gesture(Gestures.BrowRaise)
            furhat.gesture(Gestures.Smile)
            furhat.say("Non preoccuparti, riproviamoci insieme!")
            reentry()
        }
    }
}


val Middle: State = state {
    onEntry {
        furhat.gesture(Gestures.Wink)
        furhat.gesture(Gestures.BigSmile)
        furhat.say(" Mi sto divertendo un mondo con te oggi! Ora giochiamo con i sinonimi e i contrari! ")
        goto(OppositesGame)
    }
}


val OppositesGame: State = state {
    onEntry {
        furhat.gesture(Gestures.BigSmile)
        furhat.say(" In inglese ‘big’ significa grande. Sai qual è il contrario di ‘big’?")
        furhat.listen()
    }

    onResponse {
        val userInput = it.text.toLowerCase().trim()
        if (userInput == "small") {
            furhat.gesture(Gestures.Surprise)
            furhat.gesture(Gestures.Nod)
            furhat.say("Esatto! Il contrario di ‘big’ è ‘small’! Sei una vera campionessa!")
            goto(Four)
        } else {
            furhat.gesture(Gestures.Shake)
            furhat.gesture(Gestures.Smile)
            furhat.say("Non preoccuparti! Il contrario di ‘big’ è ‘small’. Riproviamoci insieme, sono sicura che riuscirai a dirlo correttamente.")
            reentry()
        }
    }
}

val Four: State = state {
    onEntry {
        furhat.gesture(Gestures.BigSmile)
        furhat.say(" Andiamo alla prossima parola, ")
        goto(Night)
    }
}

val Night: State = state {
    onEntry {
        furhat.gesture(Gestures.BigSmile)
        furhat.say(" In inglese giorno si dice 'Day'. Sai qual è il contrario di 'day'?")
        furhat.listen()
    }

    onResponse {
        val userInput = it.text.toLowerCase().trim()
        if (userInput == "night") {
            furhat.gesture(Gestures.Oh)
            furhat.gesture(Gestures.Nod)
            furhat.say("Fantastico! Notte in inglese si dice 'night', che è proprio il contrario di day.")
            goto(Centre)
        } else {
            furhat.gesture(Gestures.BrowRaise)
            furhat.gesture(Gestures.Smile)
            furhat.say("Ci sei quasi! Il contrario di 'night' è 'day', che significa giorno. Riproviamo insieme!")
            reentry()
        }
    }
}

val Centre: State = state {
    onEntry {
        furhat.gesture(Gestures.BigSmile)
        furhat.say(" Ora proviamo un nuovo gioco. Io ti dirò una frase e tu dovrai completarla con una parola!  Per esempio, considera la frase: ‘Il cielo è’. In inglese si dice: ‘The sky is’. ")
        furhat.gesture(Gestures.BigSmile)
        furhat.say(" Io completerei quasta frase con la parola luminoso, che in inglese si dice 'bright'. La frase completa sarà ‘The sky is bright’. ")
        goto(SentenceCompletion)
    }
}


val SentenceCompletion: State = state {
    onEntry {
        furhat.gesture(Gestures.Wink)
        furhat.gesture(Gestures.BigSmile)
        furhat.say(" Ora tocca a te, come possiamo completare la frase 'The sky is'? Ti suggerisco di pensare al colore del cielo.")
        furhat.listen()
    }

    onResponse {
        val userInput = it.text.toLowerCase().trim()
        if (userInput == "blue") {
            furhat.gesture(Gestures.Surprise)
            furhat.gesture(Gestures.BigSmile)
            furhat.say("Esatto! ‘The sky is blue’, ‘il cielo è blu’! Bravissima!")
            goto(Block)
        } else {
            furhat.gesture(Gestures.Shake)
            furhat.gesture(Gestures.Smile)
            furhat.say("Non è proprio giusto, ma va bene! Il cielo è ‘blue’. Sono sicura che ci riuscirai!")
            reentry()
        }
    }
}

val Block: State = state {
    onEntry {
        furhat.gesture(Gestures.BigSmile)
        furhat.say("Ora proviamo con la frase: 'Il sole è'. Io completerei quasta frase con la parola caldo, che in inglese si dice 'hot'. Ora tocca a te,")
        goto(SUN)
    }
}

val SUN: State = state {
    onEntry {
        furhat.gesture(Gestures.BigSmile)
        furhat.say(" come possiamo completare la frase: The sun is? Ti suggerisco di pensare al colore del sole.")
        furhat.listen()
    }

    onResponse {
        val userInput = it.text.toLowerCase().trim()
        if (userInput == "yellow") {
            furhat.gesture(Gestures.Wink)
            furhat.gesture(Gestures.BigSmile)
            furhat.say("Grandioso. Mi stupisce sempre di più la tua bravura!")
            goto(Idle)
        } else {
            furhat.gesture(Gestures.Wink)
            furhat.gesture(Gestures.Smile)
            furhat.say("Tranquilla, so che puoi farcela! Il sole è giallo, che in inglese si dice ‘yellow’. Riproviamo insieme, sono certa che ci riuscirai!")
            reentry()
        }
    }
}

val Idle: State = state {
    onEntry {
        furhat.gesture(Gestures.BigSmile)
        furhat.say(" Hai fatto un ottimo lavoro oggi! Ti sei divertita? Possiamo provare altre parole la prossima volta! Grazie per aver imparato con me! Bye Bye.")
        furhat.gesture(Gestures.Wink)
    }
}
