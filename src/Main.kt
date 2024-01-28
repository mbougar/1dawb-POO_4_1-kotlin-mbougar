/*
Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el area y el perimetro. Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.

Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo: override fun toString() = "". (Pulsa Ctrl+o)

En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.
*/


fun main() {
    val rectangulo1 = Rectangulo(5.0, 10.0)
    println("Datos rectangulo1: $rectangulo1")
    println("Área rectángulo 1: ${rectangulo1.calcArea()}")
    println("Perímetro rectángulo 1: ${rectangulo1.calcPerimetro()}")
    println("*****************")
    val rectangulo2 = Rectangulo(85.0, 100.0)
    println("Datos rectangulo2: $rectangulo2")
    println("Área rectángulo 2: ${rectangulo2.calcArea()}")
    println("Perímetro rectángulo 2: ${rectangulo2.calcPerimetro()}")
    println("*****************")
    val rectangulo3 = Rectangulo(65.0, 1.0)
    println("Datos rectangulo3: $rectangulo3")
    println("Área rectángulo 3: ${rectangulo3.calcArea()}")
    println("Perímetro rectángulo 3: ${rectangulo3.calcPerimetro()}")
    println("*****************")
    val rectangulo4 = Rectangulo(45.0, 140.0)
    println("Datos rectangulo3: $rectangulo3")
    println("Área rectángulo 3: ${rectangulo3.calcArea()}")
    println("Perímetro rectángulo 3: ${rectangulo3.calcPerimetro()}")
}


