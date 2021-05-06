package id.kotlin.nativekit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.kotlin.nativekit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object {
        init {
            System.loadLibrary("native-lib")
        }
    }

    private external fun apiKey(): String

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvApiKey.text = apiKey()
    }
}