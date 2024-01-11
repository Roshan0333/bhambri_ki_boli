package com.example.bhambrikiboli

import android.annotation.SuppressLint
import android.content.Context
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.media.AudioManager
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    private lateinit var mediaPlayer:MediaPlayer
    private lateinit var audioManager: AudioManager

    @SuppressLint("MissingInflatedId", "ServiceCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        audioManager=getSystemService(Context.AUDIO_SERVICE) as AudioManager

        var status:Int=0
        val hatt=findViewById<ImageButton>(R.id.hatt)
        val hatt_on=findViewById<ImageButton>(R.id.hatt_on)
        val arre=findViewById<ImageButton>(R.id.arre)
        val arre_on=findViewById<ImageButton>(R.id.arre_on)
        val apni_maa=findViewById<ImageButton>(R.id.apni_maa)
        val apni_maa_on=findViewById<ImageButton>(R.id.apni_maa_on)
        val dk=findViewById<ImageButton>(R.id.dk)
        val dk_on=findViewById<ImageButton>(R.id.dk_on)
        val chal_dk=findViewById<ImageButton>(R.id.chal_dk)
        val chal_dk_on=findViewById<ImageButton>(R.id.chal_dk_on)
        val neta=findViewById<ImageButton>(R.id.neta)
        val neta_on=findViewById<ImageButton>(R.id.neta_on)
        val volumeon=findViewById<ImageButton>(R.id.vloumeon)
        val volumnoff=findViewById<ImageButton>(R.id.vloumeoff)

       hatt_on.setOnClickListener {
           if(status==0){
               hatt.alpha=0f
               hatt_on.alpha=1f
               arre_on.alpha=0f
               arre.alpha=1f
               apni_maa_on.alpha=0f
               apni_maa.alpha=1f
               dk_on.alpha=0f
               dk.alpha=1f
               chal_dk_on.alpha=0f
               chal_dk.alpha=1f
               neta_on.alpha=0f
               neta.alpha=1f
               status=1
               mediaPlayer=MediaPlayer.create(this,R.raw.hatt)
               mediaPlayer.start()
           }
           else if(status==1){
                   hatt.alpha=1f
                   hatt_on.alpha=0f
                   status=0
               mediaPlayer.pause()

            }

        }

        arre_on.setOnClickListener {
            if(status==0 ){
                arre.alpha=0f
                arre_on.alpha=1f
                apni_maa_on.alpha=0f
                apni_maa.alpha=1f
                dk_on.alpha=0f
                dk.alpha=1f
                chal_dk_on.alpha=0f
                chal_dk.alpha=1f
                neta_on.alpha=0f
                neta.alpha=1f
                hatt.alpha=1f
                hatt_on.alpha=0f
                neta_on.alpha=0f
                neta.alpha=1f
                status=1
                mediaPlayer=MediaPlayer.create(this,R.raw.arre)
                mediaPlayer.start()
            }
            else if(status==1){
                arre.alpha=1f
                arre_on.alpha=0f
                status=0
                mediaPlayer.pause()
            }
        }

        chal_dk_on.setOnClickListener {
            if(status==0){
                chal_dk.alpha=0f
                chal_dk_on.alpha=1f
                arre_on.alpha=0f
                arre.alpha=1f
                apni_maa_on.alpha=0f
                apni_maa.alpha=1f
                dk_on.alpha=0f
                dk.alpha=1f
                hatt.alpha=1f
                hatt_on.alpha=0f
                neta_on.alpha=0f
                neta.alpha=1f
                status=1
                mediaPlayer= MediaPlayer.create(this,R.raw.chal_dk)
                mediaPlayer.start()
            }
            else if(status==1){
                chal_dk.alpha=1f
                chal_dk_on.alpha=0f
                status=0
                mediaPlayer.pause()
            }
        }

        apni_maa_on.setOnClickListener {
            if(status==0){
                apni_maa.alpha=0f
                apni_maa_on.alpha=1f
                dk_on.alpha=0f
                dk.alpha=1f
                chal_dk_on.alpha=0f
                chal_dk.alpha=1f
                neta_on.alpha=0f
                neta.alpha=1f
                hatt.alpha=1f
                hatt_on.alpha=0f
                arre_on.alpha=0f
                arre.alpha=1f
                status=1
                mediaPlayer= MediaPlayer.create(this,R.raw.apni_maaa)
                mediaPlayer.start()
            }
            else if(status==1){
                apni_maa.alpha=1f
                apni_maa_on.alpha=0f
                status=0
                mediaPlayer.pause()
            }
        }

        dk_on.setOnClickListener {
            if (status==0){
                dk.alpha=0f
                dk_on.alpha=1f
                hatt.alpha=1f
                hatt_on.alpha=0f
                arre.alpha=1f
                arre_on.alpha=0f
                chal_dk.alpha=1f
                chal_dk_on.alpha=0f
                neta.alpha=1f
                neta_on.alpha=0f
                apni_maa.alpha=1f
                apni_maa_on.alpha=0f
                status=1
                mediaPlayer= MediaPlayer.create(this,R.raw.dk)
                mediaPlayer.start()
            }
            else if(status==1){
                dk.alpha=1f
                dk_on.alpha=0f
                status=0
                mediaPlayer.pause()
            }
        }

        neta_on.setOnClickListener {
            if (status==0){
                neta.alpha=0f
                neta_on.alpha=1f
                hatt.alpha=1f
                hatt_on.alpha=0f
                arre.alpha=1f
                arre_on.alpha=0f
                chal_dk.alpha=1f
                chal_dk_on.alpha=0f
                apni_maa.alpha=1f
                apni_maa_on.alpha=0f
                dk.alpha=1f
                dk_on.alpha=0f
                status=1
                mediaPlayer= MediaPlayer.create(this,R.raw.neta_)
                mediaPlayer.start()
            }
            else if(status==1){
                neta.alpha=1f
                neta_on.alpha=0f
                status=0
                mediaPlayer.pause()
            }
        }

        volumnoff.setOnClickListener {
            if (status == 0) {
                volumeon.alpha = 0f
                volumnoff.alpha = 1f
                status = 1
                try {
                    audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 0, 0)
                } catch (e: SecurityException) {
                }
            } else {
                volumeon.alpha = 1f
                volumnoff.alpha = 0f
                status = 0
                try {
                    audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,100, AudioManager.FLAG_ALLOW_RINGER_MODES)
                } catch (e: SecurityException) {
                }
            }
        }

    }
}
