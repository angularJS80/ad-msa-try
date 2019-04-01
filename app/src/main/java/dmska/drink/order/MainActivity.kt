package dmska.drink.order

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val cates:ArrayList<Cate> = ArrayList<Cate>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        defineData()
        defineView()

    }

    private fun defineData() {
        cates.add(Cate("1234","1234"))
        cates.add(Cate("3333","3333"))

    }

    private fun defineView() {
        cate_recycler_view.adapter = CateAdapter(cates,this)
        //val lm = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val lm = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


        cate_recycler_view.layoutManager = lm

    }

}
