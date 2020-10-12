package projektas.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);
        final EditText email = findViewById(R.id.email);

        Button register = findViewById(R.id.register_btn);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this,
                        "Username:" + username.getText() + "\n" +
                                "Email:" + email.getText().toString() + "\n" +
                                "Password:" + password.getText().toString(),

                        Toast.LENGTH_SHORT).show();
                username.setError(null);
                if (!Validation.isValidusername(username.getText().toString())) {
                    username.setError("Klaida! Patikrinkite vardą");
                    username.requestFocus();


                } else if (!Validation.isValidemail(email.getText().toString())) {
                    email.setError("Klaida! Patikrinkite El. Paštą");
                    email.requestFocus();
                } else if (!Validation.isValidpassword(password.getText().toString())) {
                    password.setError("Klaida! Patikrinkite slaptažodį");
                    password.requestFocus();
                }


            else
                  { //jeigu duomenys teisingi
                Intent goToLoginActivity = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(goToLoginActivity);
            }


            }
        })
        ;
    }
}

