package dmska.drink.order

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.cate_item.view.*

class CateViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var cate: Cate? = null
    fun bind(cate: Cate) {
        this.cate = cate
        //Picasso.with(itemView.context).load(cate.cateImageUrl).into(itemView.cate_image)
        itemView.cate_image.setImageResource(cate.draqableResourceId)
        itemView.cate_name.text = cate.cateName;

    }


}
