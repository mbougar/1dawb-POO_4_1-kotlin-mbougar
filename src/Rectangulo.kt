

/**
 * Representa un rectángulo con una base y una altura.
 * @property base La medida de la base del rectángulo.
 * @property altura La medida de la altura del rectángulo.
 * @constructor Crea un rectángulo con la base y altura especificadas.
 */
class Rectangulo(val base: Double, val altura: Double) {

    init {
        require(base > 0) {"La base no puede ser menor que 0." }
        require(altura > 0) {"La altura no puede ser menor que 0."}
    }

    /**
     * Calcula el área del rectángulo.
     * @return El área del rectángulo.
     */
    fun calcArea(): Double {
        return base * altura
    }

    /**
     * Calcula el perímetro del rectángulo.
     * @return El perímetro del rectángulo.
     */
    fun calcPerimetro(): Double {
        return  base * 2 + altura * 2
    }

    /**
     * Sobrescribe el método toString para representar el objeto como una cadena de texto.
     * @return Una cadena que representa la base y altura del rectángulo.
     */
    override fun toString(): String {
        return "(Base: $base, Altura: $altura)"
    }
}