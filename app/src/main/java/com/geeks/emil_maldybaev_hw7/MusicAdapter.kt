package com.geeks.emil_maldybaev_hw7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.geeks.emil_maldybaev_hw7.databinding.FragmentDownBinding
import com.geeks.emil_maldybaev_hw7.databinding.ItemMusicBinding

class MusicAdapter(val musicList: List  <Music>, val onClick: (music: Music)-> Unit):RecyclerView.Adapter<MusicAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return musicList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(musicList[position])
    }
    inner class ViewHolder(private val binding: ItemMusicBinding ):RecyclerView.ViewHolder(binding.root){
        fun bind(music: Music){
            binding.tvSong.text = music.song
            binding.tvAutor.text = music.autor
            binding.tvCounter.text = music.counter

            itemView.setOnClickListener {
                onClick(music)
            }
        }
    }
}