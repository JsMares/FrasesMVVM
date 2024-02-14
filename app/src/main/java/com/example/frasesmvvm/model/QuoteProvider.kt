package com.example.frasesmvvm.model

class QuoteProvider {
    companion object {
        fun random(): QuoteModel {
            val position = (0..8).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "Que no se acabe la noche que dure un poco más. Quiero un shot de tus besos pa' poder recordar las malas decisiones",
                song = "Malas Decisiones",
                artist = "Kenia Os"
            ),
            QuoteModel(
                "No soy italiana y me siento bella, la mexa que tiene a to' el mundo loco",
                "Ojo x ojo",
                "Kenia Os"
            ),
            QuoteModel(
                "Headlights, on me racing to 60, I've a fool. But strawberries and cigarettes always taste like you",
                "Strawberries and cigarettes",
                "Troye Sivan"
            ),
            QuoteModel(
                "Un beso en el cine y otro donde no da el sol...",
                "Las pequeñas cosas",
                "Gloria Trevi"
            ),
            QuoteModel(
                "No hace falta guardar los secretos, se lleva el respeto en la complicidad. No hace falta fingir que es perfecto",
                "No hace falta",
                "Il Volo"
            ),
            QuoteModel(
                "Si de los dos hay rumores en la calle que no sepan los detalles nos ponemos gafas oscuras pa' que quede en duda y la vista les falle",
                "Rumores",
                "Gera MX y Kenia Os"
            ),
            QuoteModel(
                "¡Ay! Si supiera que perdió las más bellas de las primaveras, las lunas más llenas",
                "Él se equivocó",
                "Gloria Trevi"
            ),
            QuoteModel(
                "Need someone to hold me close, deeper than I've ever know whose love feels like a rodeo",
                "Training season",
                "Dua Lipa"
            ),
            QuoteModel(
                "Es que lo siento. Cada día quise decir te quiero. Quiero recuperarte y borrar lo que ya fue bajo el yugo del ayer",
                "00:00",
                "Siddhartha"
            )
        )
    }
}