package com.example.INPTSUD.KOTLIN.dao.ProductRepository


import com.example.INPTSUD.KOTLIN.data.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource
import org.springframework.web.bind.annotation.CrossOrigin


@CrossOrigin("*")
@RepositoryRestResource
interface ProductRepository : JpaRepository<Product?, Long?>{
    @RestResource(path = "/selectedProducts")
    fun findByselectedIsTrue(): List<Product?>?


    @RestResource(path = "/promoProducts")
    fun findByPromotionIsTrue(): List<Product?>?

    @RestResource(path = "/dispoProducts")
    fun findByAvailableIsTrue(): List<Product?>?



}