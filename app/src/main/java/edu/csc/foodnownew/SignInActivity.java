package edu.csc.foodnownew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtEmail, txtPassword;
    Button btnForgot, btnSignIn, btnSignUp;
    TextView btnSignInFacebook, btnSignInGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassword);
        btnForgot = findViewById(R.id.btnForgot);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignUp = findViewById(R.id.btnSignUp);
        btnSignInFacebook = findViewById(R.id.btnSignInFacebook);
        btnSignInGoogle = findViewById(R.id.btnSignInGoogle);

        btnForgot.setOnClickListener(this);
        btnSignIn.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
        btnSignInFacebook.setOnClickListener(this);
        btnSignInGoogle.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnForgot:
                break;
            case R.id.btnSignIn:
                break;
            case R.id.btnSignUp:
                break;
            case R.id.btnSignInFacebook:
                break;
            case R.id.btnSignInGoogle:
                break;
        }

    }
}
