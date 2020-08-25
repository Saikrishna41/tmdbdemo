package com.sk41.thatmoviedemo.data.repository

import android.net.Network

enum class Status {

    RUNNING,
    FAILED,
    SUCCESS
}

class NetworkState(val status: Status, val msg: String) {


    companion object {

        private lateinit var LOADED: NetworkState

        private lateinit var LOADING: NetworkState

        private lateinit var ERROR: NetworkState


    }

    init {

        LOADED = NetworkState(Status.SUCCESS, "Success")

        LOADING = NetworkState(Status.RUNNING, "Running")

        ERROR = NetworkState(Status.FAILED, "Error Connecting")

    }

}