package dmska.drink.order.fm

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import dmska.drink.order.Cate
import dmska.drink.order.CateAdapter

import dmska.drink.order.R
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment : Fragment() {
    val cates:ArrayList<Cate> = ArrayList<Cate>()

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        defineData()
        defineView()
        // TODO: Use the ViewModel
    }

    private fun defineView() {
        cate_recycler_view.adapter = CateAdapter(cates)
        //val lm = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val lm = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        cate_recycler_view.layoutManager = lm

    }

    private fun defineData() {
        cates.add(Cate("1234","1234"))
        cates.add(Cate("3333","3333"))

    }

}
