package com.drew.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

/**
 * This activity allows user to roll a dice and
 * see the result on screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollImageView: ImageView = findViewById(R.id.imageView)
        val rollButton: Button = findViewById(R.id.button)
        val dice = Dice(6)

        rollButton.setOnClickListener {
            val rollResult = dice.roll()
            val drawableResource = when (rollResult) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            //Update image and its content description
            rollImageView.setImageResource(drawableResource)
            rollImageView.contentDescription = rollResult.toString()
        }
    }
}
