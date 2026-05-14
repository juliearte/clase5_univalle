import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.clase5.Fragment1
import com.example.clase5.Fragment2

/**
 * Este adaptador es responsable de administrar y proporcionar los fragmentos que se mostrarán en el ViewPager2
 */
class ViewPagerAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Fragment1()
            1 -> Fragment2()
            else -> Fragment1()
        }
    }
}






