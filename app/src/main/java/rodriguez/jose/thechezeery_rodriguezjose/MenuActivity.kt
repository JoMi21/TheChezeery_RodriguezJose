package rodriguez.jose.thechezeery_rodriguezjose

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnColdDrinks: Button = findViewById(R.id.btnColdDrinks)
        val btnHotDrinks: Button = findViewById(R.id.btnHotDrinks)
        val btnSweets: Button = findViewById(R.id.btnSweets)
        val btnSalties: Button = findViewById(R.id.btnSalties)
        val btnCombos: Button = findViewById(R.id.btnCombos)
        val btnCustom: Button = findViewById(R.id.btnCustom)

        btnColdDrinks.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("category", "cold")
            startActivity(intent)
        }

        btnHotDrinks.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("category", "hot")
            startActivity(intent)
        }

        btnSweets.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("category", "sweet")
            startActivity(intent)
        }

        btnSalties.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("category", "salty")
            startActivity(intent)
        }

    }
}