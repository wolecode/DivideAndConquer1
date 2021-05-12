import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okio.Buffer
import java.io.BufferedOutputStream
import java.io.ByteArrayOutputStream
import java.io.File

fun main() {
    val newMax = max(intArrayOf(1, 4, 20, 10, 8, 16), 0, 5)
    println(newMax)
}
fun max(array: IntArray, left: Int, right: Int): Int {
    if (left == right - 1) {
        return if (array[left] > array[right])
            array[left]
        else
            array[right]
    }
    val middle = (left + right) / 2

    val leftMax = max(array, left, middle)
    val rightMax = max(array, middle, right)

    return if (leftMax > rightMax)
               leftMax
           else
               rightMax
}