package com.hariagus.submission1moviecataloge.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.hariagus.submission1moviecataloge.R
import com.hariagus.submission1moviecataloge.databinding.ItemListBinding
import com.hariagus.submission1moviecataloge.model.MovieEntity
import com.hariagus.submission1moviecataloge.ui.detail.DetailItemActivity
import com.hariagus.submission1moviecataloge.ui.detail.DetailItemActivity.Companion.CLICK
import com.hariagus.submission1moviecataloge.ui.detail.DetailItemActivity.Companion.ID_DATA
import com.hariagus.submission1moviecataloge.utils.loadImageGlide

class ContentAdapter(private val idAdapter: Int) : RecyclerView.Adapter<ContentAdapter.ViewHolder>() {

    private var listData = ArrayList<MovieEntity>()

    @SuppressLint("NotifyDataSetChanged")
    fun setData(dataMovie: List<MovieEntity>) {
        listData.apply {
            clear()
            addAll(dataMovie)
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): ViewHolder {
        val binding = ItemListBinding.inflate(
            LayoutInflater.from(
                parent.context
            ), parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    override fun getItemCount(): Int = listData.size

    inner class ViewHolder(
        private val binding: ItemListBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: MovieEntity) {
            val context = itemView.context

            binding.apply {
                tvTitleMovie.text = data.title
                tvReleaseDate.text = data.release
                tvCategory.text = data.category
                context.loadImageGlide(data.image, ivMovie)

            }

            setupAnim(context, itemView)
            onClickItem(itemView, data, context)
        }
    }

    private fun setupAnim(context: Context, itemView: View) {
        val anim = AnimationUtils.loadAnimation(
            context, R.anim.up_recyclerview
        )
        itemView.animation = anim
    }

    private fun onClickItem(view: View, data: MovieEntity, context: Context) {
        view.setOnClickListener {
            val moveDetail = Intent(
                context, DetailItemActivity::class.java
            ).apply {
                putExtra(ID_DATA, data.id)
                putExtra(CLICK, idAdapter)
            }
            context.startActivity(moveDetail)
        }
    }

}