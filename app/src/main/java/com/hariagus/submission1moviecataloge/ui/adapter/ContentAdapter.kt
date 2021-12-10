package com.hariagus.submission1moviecataloge.ui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.hariagus.submission1moviecataloge.R
import com.hariagus.submission1moviecataloge.model.MovieEntity
import com.hariagus.submission1moviecataloge.ui.detail.DetailItemActivity
import com.hariagus.submission1moviecataloge.ui.detail.DetailItemActivity.Companion.CLICK
import com.hariagus.submission1moviecataloge.ui.detail.DetailItemActivity.Companion.ID_DATA
import kotlinx.android.synthetic.main.item_list.view.*

class ContentAdapter(private val idAdapter: Int) : RecyclerView.Adapter<ContentAdapter.ViewHolder>() {

    private var listData = ArrayList<MovieEntity>()

    fun setData(dataMovie: List<MovieEntity>) {
        listData.apply {
            clear()
            addAll(dataMovie)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    override fun getItemCount(): Int = listData.size

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bind(data: MovieEntity) {
            itemView.apply {
                tvTitleMovie.text = data.title
                tvReleaseDate.text = data.release
                tvCategory.text = data.category

                Glide.with(itemView)
                    .load(data.image)
                    .apply(
                        RequestOptions()
                            .placeholder(R.drawable.loading_animation)
                            .error(R.drawable.ic_error)
                    )
                    .into(ivMovie)

                itemView.setOnClickListener {
                    val intentToDetail = Intent(context, DetailItemActivity::class.java).apply {
                        putExtra(ID_DATA, data.id)
                        putExtra(CLICK, idAdapter)
                    }
                    itemView.context.startActivity(intentToDetail)
                }

                val anim = AnimationUtils.loadAnimation(itemView.context, R.anim.up_recyclerview)
                itemView.animation = anim
            }
        }
    }

}