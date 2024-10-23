package presentacion
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable

fun ClimaPage() {
    val viewModel = ClimaViewModel()
    ClimaaView(
        modifier = Modifier,
        estado = viewModel.estado,
    ){
        viewModel
    }
}