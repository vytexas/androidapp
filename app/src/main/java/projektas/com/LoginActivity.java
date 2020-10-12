package projektas.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);

        Button login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this,
                        "Username:" + username.getText() + "\n" +
                                "Password" + password.getText().toString(),
                        Toast.LENGTH_SHORT).show();
username.setError(null);
                if (!Validation.isValidCredentials(username.getText().toString())) {
username.setError("Klaida! Patikrinkite duomenis");
username.requestFocus();
                } else { //jeigu duomenys teisingi
                    Intent goToSearchActivity = new Intent(LoginActivity.this, SearchActivity.class);
                    startActivity(goToSearchActivity);
                }


            }
        })
;
    }
}