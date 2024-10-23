package presentacion

sealed class ClimaEstado {
    data object Vacio : ClimaEstado()
    data object Cargando: ClimaEstado()
    data class Exitoso: (val Clima: Clima) : ClimaEstado//para tener parametro debe ser data class
    data class Error(val mensaje: string) : ClimaEstado()
}

public class Clima(
    val temperatura: Double,
            val sencacionTermica: Double,
                    val humedad: Double,
    val velocidadDelviento: Double,
    val latitud: Double,
    val longitud: Double

    )