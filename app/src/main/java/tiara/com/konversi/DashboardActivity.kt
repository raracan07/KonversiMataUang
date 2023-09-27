package tiara.com.konversi

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        card_konversi.isEnabled = true
        card_info.isEnabled = true
        card_sejarah.isEnabled = true
        card_keluar.isEnabled = true
        var alertDialog: AlertDialog? = null

        var card_konversiClick = findViewById(R.id.card_konversi) as CardView
        card_konversi.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        var card_infoClick = findViewById(R.id.card_info) as CardView
        card_info.setOnClickListener {
            startActivity(Intent(this, info::class.java))
        }

        var card_sejarahClick = findViewById(R.id.card_sejarah) as CardView
        card_sejarah.setOnClickListener {
            val url = "https://tiarautsalis.blogspot.com/2021/06/sejarah-mata-uang-dunia.html"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        var card_keluarClick = findViewById(R.id.card_keluar) as CardView
        card_keluar.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.activity_keluar, null)

            dialog.setView(dialogView)
            dialog.setCancelable(false)
            dialog.setPositiveButton ("Ya", {dialogInterface: DialogInterface, which: Int -> })
            dialog.setNegativeButton ("Tidak", {dialogInterface: DialogInterface, which: Int -> })

            val customDialog = dialog.create()
            customDialog.show()
            customDialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener({
                if (true)
                    finish()
                    customDialog.dismiss()
            })
            customDialog.getButton(AlertDialog.BUTTON_NEGATIVE).setOnClickListener({
                if (true)
                    customDialog.dismiss()
                else
                    Toast.makeText(baseContext,"Tidak",Toast.LENGTH_SHORT).show()
            })
        }
    }
}