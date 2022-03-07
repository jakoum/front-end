package com.example.INPTSUD.KOTLIN.entities
import com.example.INPTSUD.KOTLIN.dao.ProductRepository.ProductRepository
import com.example.INPTSUD.KOTLIN.data.Product

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.nio.file.Files
import java.nio.file.Paths

@RestController
class MyRestController {
    val productRepository: ProductRepository
    public constructor(p:ProductRepository){
        productRepository=p
    }

    @GetMapping(path = ["/photoProduct/{id}"], produces = [MediaType.IMAGE_PNG_VALUE])
    public fun getPhoto(@PathVariable("id") id: Long): ByteArray {
        val p: Product = productRepository.findById(id).get()
        println(System.getProperty("user.home"))

        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/ecom/products/"+p.getPhotoName()))
    }


}