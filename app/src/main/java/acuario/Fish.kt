package acuario

class Fish(val friendly: Boolean = true, volumenNeeded: Int) {
    val size: Int
    init {
        println("Primer bloque init")
    }
    constructor(): this(true,9){
        println("corriendo el constructor secundario")
    }
    init{
        if (friendly){
            size = volumenNeeded
        }else {
            size = volumenNeeded * 2
        }
    }
    init {
        println("construido pez de tamaño ${volumenNeeded} tamaño final ${this.size}")
    }
    init {
        println("ultimo bloque init")
    }
}
fun makeDefaultFish() = Fish(true,50)

fun fishExample(){
    val fish = Fish(true,20)
    println("Este pez es amistoso? ${fish.friendly}. Necesita un volumen de ${fish.size}")
}