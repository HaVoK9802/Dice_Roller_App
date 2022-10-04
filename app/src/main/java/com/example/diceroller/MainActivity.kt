package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //this function is called by Android System when the app is first started
        super.onCreate(savedInstanceState)               //Notice that there is no main function here. It sets the MainActivity by using code from the imports
        setContentView(R.layout.activity_main)
                                                             // for setting the starting layouts
        val rollButton: Button = findViewById(R.id.button) //The findViewById() method finds the Button in the layout.
                                                           // R.id.button is the resource ID for the Button, which is
                                                          // a unique identifier for it.

        rollButton.setOnClickListener {                        //Instead of the parentheses following the method name, you will actually be using curly braces
                                                               // following the method name. This is a special syntax for declaring a Lambda
                                                           // within the curly braces, you put instructions for what should happen when the button is tapped.

           val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            //a Toast, which is a brief message that appears to the user.
            toast.show()
            //tell the Toast to display itself by calling the show() method.
            /*
            You could combine the two lines in the click listener into a single line without a variable.
            This is a common pattern you might find in other code.
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show() <- without variable
             */
        }

    }
}

/*
val rollButton: Button = findViewById(R.id.button)
Note: Android automatically assigns ID numbers to the resources in your app.
For example, the Roll button has a resource ID, and the string for the button
text also has a resource ID. Resource IDs are of the form R.<type>.<name>;
for example, R.string.roll. For View IDs, the <type> is id, for example, R.id.button.

The code saves the reference to the Button object in a variable called rollButton,
not the Button object itself.

Important: When it assigns an object to a variable, Kotlin doesn't copy the entire object each time,
 it saves a reference to the object. You can think of a reference similar to a national ID number;
 the number refers to a person, but it isn't the person itself. When you copy the number,
 you don't copy the person.

*/