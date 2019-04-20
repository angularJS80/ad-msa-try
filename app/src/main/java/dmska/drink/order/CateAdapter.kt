package dmska.drink.order

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CateAdapter(val cates: ArrayList<Cate>) : RecyclerView.Adapter<CateViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CateViewHolder {
        return CateViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.cate_item, parent, false))
    }

    override fun getItemCount(): Int {
        return cates.size
    }

    override fun onBindViewHolder(holder: CateViewHolder, position: Int) {
        (holder as CateViewHolder).bind(cates[position])
    }

}
