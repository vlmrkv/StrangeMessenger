package com.mrkv.strangemessenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yandex.authsdk.YandexAuthLoginOptions
import com.yandex.authsdk.YandexAuthOptions
import com.yandex.authsdk.YandexAuthResult
import com.yandex.authsdk.YandexAuthSdk

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sdk = YandexAuthSdk.create(YandexAuthOptions(this))
        val launcher = registerForActivityResult(sdk.contract) { result ->
            handleResult(result)
        }
        val loginOptions = YandexAuthLoginOptions()
        launcher.launch(loginOptions)

        sdk.getJwt(yandexAuthToken)
    }

    private fun handleResult(result: YandexAuthResult) {
        when (result) {
            is YandexAuthResult.Success -> onSuccessAuth(result.token)
            is YandexAuthResult.Failure -> onSuccessAuth(result.exception)
            YandexAuthResult.Cancelled -> onCancelled()
        }
    }
}