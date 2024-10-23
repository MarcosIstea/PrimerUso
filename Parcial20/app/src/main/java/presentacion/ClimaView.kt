package presentacion

import androidx.compose.runtime.Composable
import java.lang.reflect.Modifier

@Composable
fun ClimaView (
modifier: Modifier = Modifier,
esatdo:ClimaEstado
ejecutar: (ClimaIntencion)-> Unit

    ){}