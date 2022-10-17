package uz.orifjon.newsappdagger2.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.orifjon.newsappdagger2.databinding.ItemOnboardingBinding

class OnBoardingAdapter() : RecyclerView.Adapter<OnBoardingAdapter.Vh>() {

    inner class Vh(private val binding: ItemOnboardingBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("CheckResult")
        fun bindingView(image: String) {
            Glide.with(binding.image).load(image).into(binding.image)
        }
    }

    private var imageList = emptyList<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemOnboardingBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.bindingView(imageList[position])
    }

    override fun getItemCount(): Int {
        return imageList.size
    }


    fun setData(list: List<String>) {
        imageList = list
        notifyDataSetChanged()
    }
}
