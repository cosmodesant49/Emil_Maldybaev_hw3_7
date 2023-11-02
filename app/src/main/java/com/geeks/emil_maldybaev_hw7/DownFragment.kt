package com.geeks.emil_maldybaev_hw7

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.emil_maldybaev_hw7.databinding.ActivityMainBinding
import com.geeks.emil_maldybaev_hw7.databinding.FragmentDownBinding

class DownFragment : Fragment() {
    private lateinit var binding:FragmentDownBinding
    private val musicList= arrayListOf(
        Music("Wish I Had An Angel","Nightwish","1"),
        Music("Holiday", "Green Day","2"),
        Music("Die, Die My Darling","Melallica","3"),
        Music("Its My LIfe","Bon Jovi","4"),
        Music("Nymphetamine","Cradle Of Filth","5"),
        Music("Killer Queen","Queen","6"),
        Music("Fait","Linkin Park","7"),
        Music("Come As You Are","Nirvana","8"),
        Music("Animals","Nickelback","9"),
        Music("I was Made For Lovin You","Kiss","10")
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDownBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = MusicAdapter(musicList, this::onClick)
        binding.rvMusic.adapter = adapter
    }
    private fun onClick(music: Music) {
        val intent = Intent(requireActivity(), SecondActivity::class.java)
        intent.putExtra("songName", music.song)
        startActivity(intent)
    }
}