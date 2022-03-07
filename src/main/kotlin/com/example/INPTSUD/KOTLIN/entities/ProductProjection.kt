import com.example.INPTSUD.KOTLIN.data.Product
import org.springframework.data.rest.core.config.Projection

@Projection(name = "P1", types = [Product::class])
interface ProductProjection {
    val currentPrice: Double
}