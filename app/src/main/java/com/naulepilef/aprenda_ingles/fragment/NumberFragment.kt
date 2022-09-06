package com.naulepilef.aprenda_ingles.fragment

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.naulepilef.aprenda_ingles.R

class NumberFragment : Fragment(), View.OnClickListener {
    private lateinit var imageOne: ImageButton
    private lateinit var imageTwo: ImageButton
    private lateinit var imageThree: ImageButton
    private lateinit var imageFour: ImageButton
    private lateinit var imageFive: ImageButton
    private lateinit var imageSix: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View? = inflater.inflate(R.layout.fragment_number, container, false)

        if (view != null){
            imageOne = view.findViewById(R.id.fragment_number_image_one)
            imageTwo = view.findViewById(R.id.fragment_number_image_two)
            imageThree = view.findViewById(R.id.fragment_number_image_three)
            imageFour = view.findViewById(R.id.fragment_number_image_four)
            imageFive = view.findViewById(R.id.fragment_number_image_five)
            imageSix = view.findViewById(R.id.fragment_number_image_six)

            imageOne.setOnClickListener(this)
            imageTwo.setOnClickListener(this)
            imageThree.setOnClickListener(this)
            imageFour.setOnClickListener(this)
            imageFive.setOnClickListener(this)
            imageSix.setOnClickListener(this)
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
            R.id.fragment_number_image_one -> {
                val mediaPlayer = MediaPlayer.create(activity, R.raw.one)
                playMediaPlayer(mediaPlayer)
            }
            R.id.fragment_number_image_two -> {
                val mediaPlayer = MediaPlayer.create(activity, R.raw.two)
                playMediaPlayer(mediaPlayer)
            }
            R.id.fragment_number_image_three -> {
                val mediaPlayer = MediaPlayer.create(activity, R.raw.three)
                playMediaPlayer(mediaPlayer)
            }
            R.id.fragment_number_image_four -> {
                val mediaPlayer = MediaPlayer.create(activity, R.raw.four)
                playMediaPlayer(mediaPlayer)
            }
            R.id.fragment_number_image_five -> {
                val mediaPlayer = MediaPlayer.create(activity, R.raw.five)
                playMediaPlayer(mediaPlayer)
            }
            R.id.fragment_number_image_six -> {
                val mediaPlayer = MediaPlayer.create(activity, R.raw.six)
                playMediaPlayer(mediaPlayer)
            }
        }
    }
}