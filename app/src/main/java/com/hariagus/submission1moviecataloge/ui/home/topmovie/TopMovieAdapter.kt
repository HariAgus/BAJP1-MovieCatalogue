package com.hariagus.submission1moviecataloge.ui.home.topmovie

import android.view.LayoutInflater
import android.view.ViewGroup
import com.hariagus.submission1moviecataloge.databinding.ItemListTopMovieBinding
import com.hariagus.submission1moviecataloge.model.MovieEntity
import com.hariagus.submission1moviecataloge.utils.loadImageGlide
import com.smarteist.autoimageslider.SliderViewAdapter

class TopMovieAdapter : SliderViewAdapter<TopMovieAdapter.ViewHolder>() {

    private val listTopMovie = ArrayList<MovieEntity>()
    private val sizeItems = 5

    fun setData(items: List<MovieEntity>) {
        listTopMovie.apply {
            addAll(items)
            notifyDataSetChanged()
        }
    }

    override fun getCount(): Int = sizeItems

    override fun onCreateViewHolder(parent: ViewGroup?): ViewHolder {
        return ViewHolder(
            ItemListTopMovieBinding.inflate(
                LayoutInflater.from(parent?.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(viewHolder: ViewHolder?, position: Int) {
        viewHolder?.bind(listTopMovie[position])
    }

    class ViewHolder(private val binding: ItemListTopMovieBinding) :
        SliderViewAdapter.ViewHolder(binding.root) {

        fun bind(data: MovieEntity) {
            val context = itemView.context

            binding.apply {
                context.loadImageGlide(data.image, roundedPoster)
                tvTitle.text = data.title
            }
        }

    }
}