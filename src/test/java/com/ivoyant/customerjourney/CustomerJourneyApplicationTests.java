//package com.ivoyant.customerjourney;
//
//import com.ivoyant.customerjourney.controller.CustomerAccessController;
//import com.ivoyant.customerjourney.entity.Customer;
//import com.ivoyant.customerjourney.service.CustomerAccessService;
//import org.elasticsearch.action.search.SearchRequest;
//import org.elasticsearch.action.search.SearchResponse;
//import org.elasticsearch.client.RequestOptions;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.elasticsearch.search.SearchHit;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.ResponseEntity;
//
//import java.io.IOException;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.*;
//
//
//class CustomerJourneyApplicationTests {
//    @Mock
//    private CustomerAccessService customerAccessService;
//
//    @InjectMocks
//    private CustomerAccessController customerController;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void testGetCustomer() throws IOException {
//        // Mocking the behavior of customerAccessService.getCustomerObject method
//        when(customerAccessService.getCustomerObject(anyString())).thenReturn(any(Customer.class));
//
//        // Calling the method under test
//        Customer responseEntity = customerController.getCustomer("123");
//
//        // Asserting the response
//        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
//        assertNotNull(responseEntity.getBody());
//    }
//}
