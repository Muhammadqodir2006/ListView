package uz.itschool.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import uz.itschool.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var names = arrayOf(
        "Elnur",
        "Farrux",
        "Diyor",
        "Behruz",
        "Muhammmadqodir",
        "Shamsiddin",
        "Doniyor",
        "Shohrux",
        "Hasan",
        "Elnur",
        "Farrux",
        "Diyor",
        "Behruz",
        "Muhammmadqodir",
        "Shamsiddin",
        "Doniyor",
        "Shohrux",
        "Hasan",
        "Elnur",
        "Farrux",
        "Diyor",
        "Behruz",
        "Muhammmadqodir",
        "Shamsiddin",
        "Doniyor",
        "Shohrux",
        "Hasan",
        "Elnur",
        "Farrux",
        "Diyor",
        "Behruz",
        "Muhammmadqodir",
        "Shamsiddin",
        "Doniyor",
        "Shohrux",
        "Hasan",
        "Elnur",
        "Farrux",
        "Diyor",
        "Behruz",
        "Muhammmadqodir",
        "Shamsiddin",
        "Doniyor",
        "Shohrux",
        "Hasan",
        "Elnur",
        "Farrux",
        "Diyor",
        "Behruz",
        "Muhammmadqodir",
        "Shamsiddin",
        "Doniyor",
        "Shohrux",
        "Hasan",
        "Elnur",
        "Farrux",
        "Diyor",
        "Behruz",
        "Muhammmadqodir",
        "Shamsiddin",
        "Doniyor",
        "Shohrux",
        "Hasan",


        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrayAdapter =
            ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, names)
        binding.listView.adapter = arrayAdapter

    }
}