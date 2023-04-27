package com.example.listabooks

data class DataBooks(
    val cover: Int,
    val title: String,
    val autor: String,
    val resenha: String,
    val stared: Boolean,

)

class BookListBuilder {
    var cover: Int = 0
    var title: String = ""
    var autor: String = ""
    var resenha: String = ""
    var stared: Boolean = false
    

    fun build (): DataBooks = DataBooks(cover,title,autor,resenha,stared)

}

fun books(imageId: Int, block: BookListBuilder.() -> Unit): DataBooks {
    return BookListBuilder().apply {
        cover = imageId
        block()
    }.build()
}



fun FakeList(): MutableList<DataBooks> = mutableListOf(
    books(R.drawable.whitney) {
        title = "Whitney,My Love"
        autor = "Judith McNaught"
        resenha= "Whitney Stone grew from a saucy hoyden into a ravishingly sensual woman. \n" +
                "Fresh from her triumphs in Paris society, she returned to England to win the heart of Paul, her childhood love..."
        stared= true
    },
    books(R.drawable.orgulho_preconceito) {
        title = "Pride and Prejudice"
        autor = "Jane Austen"
        resenha =" Pride and Prejudice is story of the Bennet family, a family of five daughters where the parents \n" +
                "are desperate for at least one of them to make a wealthy match and save the next generation from destitution."
        stared=false
    },
    books(R.drawable.bridgertons) {
        title= "An Offer From a Gentleman"
        autor="Julia Quinn"
        resenha="Sophie Beckett never dreamed she’d be able to sneak into Lady Bridgerton’s famed masquerade \n" +
                "ball—or that “Prince Charming” would be waiting there for her! Though the daughter of an earl, "
        stared=true
    },
    books(R.drawable.aselecao) {
        title="The Selection"
        autor="Kiera Cass"
        resenha="Thirty-five beautiful girls. Thirty-five beautiful rivals…\n" +
                "It’s the chance of a lifetime and 17-year-old America Singer should feel lucky."
        stared=true
    },
    books(R.drawable.para_todos_garotos) {
        title="To All the Boys I've Loved Before"
        autor="Jenny Han"
        resenha="Lara Jean keeps her love letters in a hatbox her mother gave her.\n" +
                "One for every boy she's ever loved.\n" +
                "When she writes, she can pour out her heart and soul and say all the things she would never say in real life, \n" +
                "because her letters are for her eyes only."
        stared=false
    },
    books(R.drawable.mil_beijos) {
        title="A Thousand Boy Kisses"
        autor="Tillie Cole"
        resenha="Two hearts. One love story. An ending you will never forget . . .\n" +
                "Rune Kristiansen and Poppy Litchfield met as children and swore to be friends forever."
        stared=false
    },
    books(R.drawable.assim_acaba){
        title="It Ends With Us"
        autor="Colleen Hoover"
        resenha="Lily hasn’t always had it easy, but that’s never stopped her from working hard for the life she wants. \n" +
                "She’s come a long way from the small town where she grew up—she graduated from college "
        stared=false
    },
    books(R.drawable.culpadas_estrelas){
        title="The Fault in Our Stars"
        autor="John Green"
        resenha="fell in love the way you fall asleep: slowly, then all at once.Despite the tumour-shrinking medical miracle that has bought her a few years, "
        stared=true
    },
    books(R.drawable.jogos_vorazes){
        title="The Hunger Games"
        autor="Suzanne Collins"
        resenha="Set in a dark vision of the near future, a terrifying reality TV show is taking place. " +
                "Twelve boys and twelve girls are forced to appear in a live event called The Hunger Games."
        stared=true
    },
    books(R.drawable.me_before_you){
        title="Me Before You"
        autor="Jojo Moyes"
        resenha="Lou Clark knows lots of things. She knows how many footsteps there are between the bus stop and home. \n" +
                "She knows she likes working in The Buttered Bun teashop and she knows she might not love her boyfriend Patrick."
        stared=false
    }

)

