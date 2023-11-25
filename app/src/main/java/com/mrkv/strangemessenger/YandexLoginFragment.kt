//package com.mrkv.strangemessenger
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import com.yandex.authsdk.YandexAuthException
//import com.yandex.authsdk.YandexAuthLoginOptions
//import com.yandex.authsdk.YandexAuthOptions
//import com.yandex.authsdk.YandexAuthResult
//import com.yandex.authsdk.YandexAuthSdk
//import com.yandex.authsdk.YandexAuthToken
//
//
//class YandexLoginFragment : Fragment() {
//
//    private var yandexLoginView: View? = null
//    private lateinit var sdk: YandexAuthSdk
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        yandexLoginView = inflater.inflate(R.layout.fragment_yandex_login, container, false)
//        startAuth()
//        return yandexLoginView
//    }
//
//
//
//    private fun startAuth() {
//        sdk = YandexAuthSdk.create(YandexAuthOptions(requireContext()))
//        val launcher = registerForActivityResult(sdk.contract) {
//            result -> handleResult(result)
//        }
//        val loginOptions = YandexAuthLoginOptions()
//        launcher.launch(loginOptions)
//    }
//
//    private fun handleResult(result: YandexAuthResult) {
//        when (result) {
//            is YandexAuthResult.Success -> onSuccessAuth(result.token)
//            is YandexAuthResult.Failure -> onProcessError(result.exception)
//            YandexAuthResult.Cancelled -> onCancelled()
//        }
//    }
//
//    private fun onSuccessAuth(token: YandexAuthToken) {
//        // TODO:
//    }
//
//    private fun onProcessError(exception: YandexAuthException) {
//        // TODO:
//    }
//
//    private fun onCancelled() {
//        TODO("Not yet implemented")
//    }
//}