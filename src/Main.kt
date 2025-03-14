
fun main() {
    val sistema = ReservasHotel()

    while (true) {

        println("1- Registrar Reserva")
        println("2- Cancelar Reserva")
        println("3- Mostrar Reservas Activas")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Id Reserva: ")
                val idReserva = readLine()?.toIntOrNull() ?: continue
                print("Id Huesped: ")
                val idHuesped = readLine()?.toIntOrNull() ?: continue
                print("Nombre Huesped: ")
                val nombreHuesped = readLine() ?: continue
                print("Email Huesped: ")
                val emailHuesped = readLine() ?: continue
                print("Numero de Habitacion: ")
                val numeroHabitacion = readLine()?.toIntOrNull() ?: continue
                print("Tipo de Habitacion: ")
                val tipoHabitacion = readLine() ?: continue
                print("Precio por Noche: ")
                val precioPorNoche = readLine()?.toDoubleOrNull() ?: continue
                print("Cantidad de Noches: ")
                val cantidadNoches = readLine()?.toIntOrNull() ?: continue

                val reserva = ReservasHotel.Reserva(
                    idReserva, idHuesped, nombreHuesped, emailHuesped, numeroHabitacion, tipoHabitacion, precioPorNoche, cantidadNoches
                )
                sistema.registrarReserva(reserva)
            }
            2 -> {
                print("Ingrese el ID de la reserva a cancelar: ")
                val idReserva = readLine()?.toIntOrNull() ?: continue
                sistema.cancelarReserva(idReserva)
            }
            3 -> sistema.mostrarReservasActivas()

            else -> println("Opcion invalida")
        }
    }
}
