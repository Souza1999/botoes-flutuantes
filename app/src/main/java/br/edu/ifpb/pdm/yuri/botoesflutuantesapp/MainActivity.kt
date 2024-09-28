package br.edu.ifpb.pdm.yuri.botoesflutuantesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.edu.ifpb.pdm.yuri.botoesflutuantesapp.ui.theme.BotoesFlutuantesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BotoesFlutuantesAppTheme {
                ExemploBotoesFlutuantes()
            }
        }
    }
}

@Composable
fun ExemploBotoesFlutuantes() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Botão de ação flutuante padrão
        FloatingActionButton(
            onClick = { /* Ação padrão */ },
        ) {
            Icon(Icons.Filled.Add, contentDescription = "Adicionar")
        }

        // Botão de ação flutuante pequeno
        SmallFloatingActionButton(
            onClick = { /* Ação pequena */ },
        ) {
            Icon(Icons.Filled.Add, contentDescription = "Adicionar (pequeno)")
        }

        // Botão de ação flutuante grande
        LargeFloatingActionButton(
            onClick = { /* Ação grande */ },
        ) {
            Icon(Icons.Filled.Add, contentDescription = "Adicionar (grande)")
        }

        // Botão de ação flutuante estendido
        ExtendedFloatingActionButton(
            onClick = { /* Ação estendida */ },
            icon = { Icon(Icons.Filled.Edit, contentDescription = "Editar") },
            text = { Text("FAB Estendido") }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewExemploBotoesFlutuantes() {
    BotoesFlutuantesAppTheme {
        ExemploBotoesFlutuantes()
    }
}
