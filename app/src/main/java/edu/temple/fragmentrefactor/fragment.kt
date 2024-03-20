package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class fragment : Fragment() {

    lateinit var displayTextView: TextView
    lateinit var nameEditText: EditText
    lateinit var changeButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment, container, false).apply{

            displayTextView = findViewById<TextView>(R.id.displayTextView)
            nameEditText = findViewById<EditText>(R.id.nameEditText)
            changeButton = findViewById<Button>(R.id.changeButton)


            changeButton.setOnClickListener {
                val name = nameEditText.text

                displayTextView.text = if (name.isNotBlank()) {
                    "Hello, $name!"
                } else {
                    "Please enter your name"
                }
            }
        }


    }

    companion object {

        fun newInstance() =
            fragment().apply {
                arguments = Bundle().apply {

                }
            }
    }


}