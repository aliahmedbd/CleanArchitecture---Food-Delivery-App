package info.aliahmed.fooddelivery.ui.base

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import info.aliahmed.fooddelivery.R

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    abstract fun inflateLayout(inflater: LayoutInflater): VB

    private val binding: VB by lazy { inflateLayout(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setTheme(R.style.LightTheme)
        setContentView(binding.root)
    }

}