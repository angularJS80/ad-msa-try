package dmska.drink.order

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        defineToolbar()
    }

    private fun defineToolbar() {
        setSupportActionBar(my_toolbar)
        getSupportActionBar()?.setLogo(R.mipmap.ic_launcher)
        getSupportActionBar()?.setDisplayUseLogoEnabled(true)

        val host = NavHostFragment.create(R.navigation.nav_graph)
        supportFragmentManager.beginTransaction().replace(R.id.my_nav_host_fragment, host).setPrimaryNavigationFragment(host).commit()

    }
    //액션바 추가 처리 방법 은 사이트 참조 https://tutorial.eyehunts.com/android/android-toolbar-example-android-app-bar-kotlin/


    @SuppressLint("ResourceType")
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {
            R.id.signIn ->{
                val songBundle = Bundle()
               // songBundle.putString("nameArg", first_name.text.toString())
                NavHostFragment.findNavController(my_nav_host_fragment).navigate(R.id.signInFragment, songBundle)
                return true
            }
                    R.id.signOut ->
                println("signOut")

        }
        return super.onOptionsItemSelected(item)
    }

}
