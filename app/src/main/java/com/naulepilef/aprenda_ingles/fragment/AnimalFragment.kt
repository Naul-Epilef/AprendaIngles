package com.naulepilef.aprenda_ingles.fragment

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.naulepilef.aprenda_ingles.R

class AnimalFragment : Fragment(), View.OnClickListener {
    private lateinit var imageDog: ImageButton
    private lateinit var imageCat: ImageButton
    private lateinit var imageLion: ImageButton
    private lateinit var imageMonkey: ImageButton
    private lateinit var imageSheep: ImageButton
    private lateinit var imageCow: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View? = inflater.inflate(R.layout.fragment_animal, container, false)

        if (view != null){
            imageDog = view.findViewById(R.id.fragment_animal_image_dog)
            imageCat = view.findViewById(R.id.fragment_animal_image_cat)
            imageLion = view.findViewById(R.id.fragment_animal_image_lion)
            imageMonkey = view.findViewById(R.id.fragment_animal_image_monkey)
            imageSheep = view.findViewById(R.id.fragment_animal_image_sheep)
            imageCow = view.findViewById(R.id.fragment_animal_image_cow)

            imageDog.setOnClickListener(this)
            imageCat.setOnClickListener(this)
            imageLion.setOnClickListener(this)
            imageMonkey.setOnClickListener(this)
            imageSheep.setOnClickListener(this)
            imageCow.setOnClickListener(this)
        }

        return view
    }

    private fun playMediaPlayer(mediaPlayer: MediaPlayer){
        mediaPlayer.start()
        mediaPlayer.setOnCompletionListener {
            mediaPlayer.release()
        }
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.fragment_animal_image_dog -> {
                val mediaPlayer = MediaPlayer.create(activity, R.raw.dog)
                playMediaPlayer(mediaPlayer)
            }
            R.id.fragment_animal_image_cat -> {
                val mediaPlayer = MediaPlayer.create(activity, R.raw.cat)
                playMediaPlayer(mediaPlayer)
            }
            R.id.fragment_animal_image_lion -> {
                val mediaPlayer = MediaPlayer.create(activity, R.raw.lion)
                playMediaPlayer(mediaPlayer)
            }
            R.id.fragment_animal_image_monkey -> {
                val mediaPlayer = MediaPlayer.create(activity, R.raw.monkey)
                playMediaPlayer(mediaPlayer)
            }
            R.id.fragment_animal_image_sheep -> {
                val mediaPlayer = MediaPlayer.create(activity, R.raw.sheep)
                playMediaPlayer(mediaPlayer)
            }
            R.id.fragment_animal_image_cow -> {
                val mediaPlayer = MediaPlayer.create(activity, R.raw.cow)
                playMediaPlayer(mediaPlayer)
            }
        }
    }
}