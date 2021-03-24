package com.byteforce_crew.educard.boundaries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.byteforce_crew.educard.R;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

// Only for moderators (organisation)
public class RegistrationPage extends AppCompatActivity {

    private final String FIRSTNAME = "firstname";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        // -- UI element tag to variables --
        EditText username_field = findViewById(R.id.etReg_username);
        EditText firstname_field = findViewById(R.id.etReg_firstname);
        Button register_btn = findViewById(R.id.btn_register);

        /* ================
         On click listener
        ===================*/

        // -- We need a event listener to check that the username is not taken --

        register_btn.setOnClickListener(v -> {

            // Registration For New Users
            registerUser(username_field, firstname_field);
        });

    }

    // -- Methods to be used
    private boolean validateFields(){
        // -- Check empty --

        // -- Check If Username is available and valid --

        return false;
    }

    private void registerUser(EditText usernameField, EditText firstnameField) {

        // -- Initializing the Firestore database --
        FirebaseFirestore db = FirebaseFirestore.getInstance();

        // -- Get all the string values --
        String username = usernameField.getText().toString();
        String firstname = firstnameField.getText().toString();

        // -- Validate fields (Make sure all fields are valid) --


        // -- Insert new user to collection (User) --
        Map<String, Object> user = new HashMap<>();
        user.put(FIRSTNAME, username);

        // -- Insert user data with CUSTOM ID --
        db.collection("User")
                .document(username)
                .set(user)
                .addOnSuccessListener(v ->{
                    // Show Success Message
                })
                .addOnFailureListener(exception ->{
                    // Show Failure Message
                });


    }

}