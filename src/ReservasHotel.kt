class ReservasHotel{
    private val reservas = mutableListOf<Reserva>()

    class Reserva(
        val idReserva: Int,
        val idHuesped: Int,
        val nombreHuesped: String,
        val emailHuesped: String,
        val numeroHabitacion: Int,
        val tipoHabitacion: String,
        val precioPorNoche: Double,
        val cantidadNoches: Int
    ) {
        fun calcularMontoTotal(): Double {
            return precioPorNoche * cantidadNoches
        }
    }

    fun registrarReserva(reserva: Reserva): Boolean {
        if (reservas.any { it.numeroHabitacion == reserva.numeroHabitacion }) {
            println("Habitacion Reservada, Escoga Otra")
            return false
        }
        reservas.add(reserva)
        println("Reserva Realizada Con Exito ")
        return true
    }
    fun cancelarReserva(idReserva: Int): Boolean {
        val reserva = reservas.find { it.idReserva == idReserva }
        return if (reserva != null) {
            reservas.remove(reserva)
            println("Reserva Cancelada")
            true
        } else {
            println("No se encontro la reserva con ID $idReserva")
            false
        }
    }
    fun mostrarReservasActivas() {
        if (reservas.isEmpty()) {
            println("No Hay Reservas Activas")
        } else {
            reservas.forEach {
                println("Reserva ID: ${it.idReserva}, Id Huesped: ${it.idHuesped}, Huesped: ${it.nombreHuesped}, Habitacion: ${it.numeroHabitacion},Email: ${it.emailHuesped}, Tipo De Habitacion: ${it.tipoHabitacion}, Total: ${it.calcularMontoTotal()}")
            }
        }
    }












}