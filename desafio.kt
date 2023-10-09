enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} foi matriculado na formação $nome.")
    }
}

fun main() {
    // Criando objetos de exemplo
    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario("Bob")
    
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 90)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 120)
    
    val formacao = Formacao("Curso de Desenvolvimento Kotlin", listOf(conteudo1, conteudo2))
    
    // Matriculando os usuários
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    
    // Exibindo os inscritos na formação
    println("Inscritos na formação ${formacao.nome}: ${formacao.inscritos.map { it.nome }}")
}
