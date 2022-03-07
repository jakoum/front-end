package com.example.INPTSUD.KOTLIN.data

import com.example.INPTSUD.KOTLIN.data.Category
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import lombok.ToString
import java.io.Serializable
import javax.persistence.*

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Product : Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null
    private var name: String? = null
    private var description: String? = null
    private var currentPrice = 0.0
    private var promotion = false
    private var selected = false
    private var available = false
    private var photoName: String? = null

    @ManyToOne
    private var category: Category? = null

    fun getId(): Long? {
        return id
    }

    fun setId(id: Long?) {
        this.id = id
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getDescription(): String? {
        return description
    }

    fun setDescription(description: String?) {
        this.description = description
    }

    fun getCurrentPrice(): Double {
        return currentPrice
    }

    fun setCurrentPrice(currentPrice: Double) {
        this.currentPrice = currentPrice
    }

    fun isPromotion(): Boolean {
        return promotion
    }

    fun setPromotion(promotion: Boolean) {
        this.promotion = promotion
    }

    fun isSelected(): Boolean {
        return selected
    }

    fun setSelected(selected: Boolean) {
        this.selected = selected
    }

    fun isAvailable(): Boolean {
        return available
    }

    fun setAvailable(available: Boolean) {
        this.available = available
    }

    fun getPhotoName(): String? {
        return photoName
    }

    fun setPhotoName(photoName: String?) {
        this.photoName = photoName
    }

    fun getCategory(): Category? {
        return category
    }

    fun setCategory(category: Category?) {
        this.category = category
    }
}