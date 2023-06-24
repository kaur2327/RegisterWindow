package com.satnam.registerwindow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var register : TextView
    lateinit var EE : EditText
    lateinit var pass : EditText
    lateinit var phn : EditText
    lateinit var gender : RadioGroup
    lateinit var male : RadioButton
    lateinit var female : RadioButton
    lateinit var other : RadioButton
    lateinit var reg : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        register = (findViewById(R.id.register))
        EE = (findViewById(R.id.EE))
        pass = (findViewById(R.id.pass))
        phn = (findViewById(R.id.phn))
        gender = (findViewById(R.id.gender))
        male = (findViewById(R.id.male))
        female = (findViewById(R.id.female))
        other = (findViewById(R.id.other))
        reg = (findViewById(R.id.reg))

        reg.setOnClickListener {
            if (EE.text.toString().isEmpty()) {
                EE.error = "It is mandatory to fill in email"
            } else if (pass.text.toString().isEmpty()) {
                pass.error = "It is mandatory to fill in password"
            } else if (pass.text.length < 6) {
                pass.error = "Password must be of 6 character"
            } else if (phn.text.toString().isEmpty()) {
                phn.error = "It is mandatory to fill in mobile no"
            } else if (phn.text.length < 10) {
                phn.error = "mobile no must be 10 digits"
            } else if (gender.checkedRadioButtonId == -1) {
                Toast.makeText(this, "It is mandatory to choose gender", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Account has created successfully", Toast.LENGTH_LONG).show()
            }
        }
    }
}