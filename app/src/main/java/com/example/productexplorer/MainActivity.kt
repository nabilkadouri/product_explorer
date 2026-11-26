package com.example.productexplorer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.productexplorer.data.sampleCategories
import com.example.productexplorer.data.sampleProducts
import com.example.productexplorer.ui.screens.ProductCatalogContainer

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                ProductCatalogContainer(
                    onProductClick = {
                        // Plus tard : ouvrir le détail du produit
                    },
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}

