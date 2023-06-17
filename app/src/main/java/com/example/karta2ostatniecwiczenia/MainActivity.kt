import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.karta2ostatniecwiczenia.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootLayout: LinearLayout = findViewById(R.id.root_layout)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setTitle("App background color")
            builder.setMessage("Are you sure you want to set the app background color to RED?")
            builder.setPositiveButton("YES") { dialog, which ->
                Toast.makeText(applicationContext, "Ok, we will change the app background.", Toast.LENGTH_SHORT).show()

                rootLayout.setBackgroundColor(Color.RED)
            }
            builder.setNegativeButton("No") { dialog, which ->
                Toast.makeText(applicationContext, "You do not agree.", Toast.LENGTH_SHORT).show()
            }
            builder.setNeutralButton("Cancel") { _, _ ->
                Toast.makeText(applicationContext, "You canceled the dialog.", Toast.LENGTH_SHORT).show()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }
}