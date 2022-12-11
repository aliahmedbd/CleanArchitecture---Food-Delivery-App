package info.aliahmed.fooddelivery.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import dagger.hilt.android.AndroidEntryPoint
import info.aliahmed.fooddelivery.R
import info.aliahmed.fooddelivery.ui.base.BaseActivity
import info.aliahmed.fooddelivery.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun inflateLayout(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        @DrawableRes val darkModeIcon: Int =
            if (true) R.drawable.ic_dark_mode_fill else R.drawable.ic_dark_mode
        menu?.findItem(R.id.action_dark_mode)?.icon = ContextCompat.getDrawable(this, darkModeIcon)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_dark_mode -> {
                // TODO: Have to work on dark theme
            }
        }
        return true
    }
}