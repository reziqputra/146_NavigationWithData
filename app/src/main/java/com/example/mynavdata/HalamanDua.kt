package com.example.mynavdata

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.mynavdata.data.OrderUIState

@Composable
fun HalamanDua(
    orderUIState: OrderUIState,
    onCancelButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
){
    val items = listOf(
        Pair(stringResource(R.string.quantity), orderUIState.jumlah),
        Pair(stringResource(R.string.flavor), orderUIState.rasa)
    )
    Column(modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        
    }
}