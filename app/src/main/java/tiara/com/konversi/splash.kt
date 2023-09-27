package tiara.com.konversi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splash : AppCompatActivity() {
    //Deklarasi variabel timer splash screen
    private val SPLASH_TIME_OUT:Long = 3000 // delay 3 detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Kode untuk menjalankan main screen setelah timer habis
        Handler().postDelayed({
            startActivity(Intent(this,DashboardActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}