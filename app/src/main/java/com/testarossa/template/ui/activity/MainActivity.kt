package com.testarossa.template.ui.activity

import android.os.Bundle
import androidx.activity.viewModels
import com.testarossa.template.R
import com.testarossa.template.databinding.ActivityMainBinding
import com.testarossa.template.library.ui.activity.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {
    // region Const and Fields
    private val viewModel by viewModels<MainViewModel>()
    // endregion

    // region override/ listener method
    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun isSingleTask(): Boolean {
        return true
    }

    override fun enableDarkMode(): Boolean {
        return false
    }

    override fun initViews(savedInstanceState: Bundle?) {

    }
    // endregion

    // region private method

    // endregion
}