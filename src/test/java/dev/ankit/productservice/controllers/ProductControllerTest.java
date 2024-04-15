package dev.ankit.productservice.controllers;

import dev.ankit.productservice.dtos.GenericProductDto;
import dev.ankit.productservice.exceptions.NotFoundException;
import dev.ankit.productservice.services.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class ProductControllerTest {
    @Autowired
    private ProductController productController;
    @MockBean
    private ProductService productServiceMock;
    @Test
    public void testGetProductById(){
        
    }
//    @Test
//    public void  testGetProductByIdReturnsEmptyObjectWhenNoProductIsFound() throws NotFoundException {
//        when(productServiceMock.getProductById(any(Long.class)))
//                .thenReturn(null);
//        GenericProductDto response = productController.getProductById(1L);
//        Assertions.assertNotNull(response);
//    }

//    @Test
//    public void tsetGetProductByIdReturnsCorrectResponse() throws NotFoundException {
//        GenericProductDto toBeReturned = new GenericProductDto();
//        toBeReturned.setId(2L);
//        toBeReturned.setTitle("iphone");
//        when(productServiceMock.getProductById(any())).thenReturn(toBeReturned);
//        GenericProductDto response = productController.getProductById(1L);
//        Assertions.assertEquals(response.getId(),2L);
//        Assertions.assertEquals(response.getTitle(),"iphone");
//    }

//    @Test
//    public void testGetProductById2() throws NotFoundException {
//        when(productServiceMock.getProductById(any())).thenReturn(null);
//
//        GenericProductDto response = productController.getProductById(null);
////        verify(productServiceMock, times(0)).getProductById(null);
//        Assertions.assertEquals(response.getId(), null);
//        Assertions.assertEquals(response.getTitle(), null);
//    }
}
