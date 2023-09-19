package com.nikdev.bluetootharlopetproject.presentation

import com.nikdev.bluetootharlopetproject.domain.chat.BluetoothDevice
import com.nikdev.bluetootharlopetproject.domain.chat.BluetoothMessage

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,
    val errorMessage: String? = null,
    val messages: List<BluetoothMessage> = emptyList()
)
