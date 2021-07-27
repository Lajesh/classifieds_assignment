package com.dubizzle.classifieds

import com.dubizzle.classifieds.base.BaseTest
import com.dubizzle.domain.usecases.products.IProductsUseCase
import com.dubizzle.products.view.fragment.products.ProductListingViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.TestCoroutineDispatcher
import okhttp3.mockwebserver.MockWebServer
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.koin.test.inject
import java.net.HttpURLConnection
import java.util.concurrent.TimeUnit

/****
 * Unit test for LogiViewModel
 * Author: Lajesh Dineshkumar
 *****/
@RunWith(JUnit4::class)
@ExperimentalCoroutinesApi
class ProductListingViewModelTest : BaseTest() {

    private lateinit var productListingViewModel: ProductListingViewModel

    //Inject api service created with koin
    private val productUseCase: IProductsUseCase by inject()

    //Inject Mockwebserver created with koin
    private val mockWebServer: MockWebServer by inject()

    private val testDispatcher = TestCoroutineDispatcher()


    override fun setUp() {
        super.setUp()
        productListingViewModel = ProductListingViewModel(productUseCase, testDispatcher)
    }

    @Test
    @ExperimentalCoroutinesApi
    fun test_product_lisiting_success_case() = runBlocking {
        mockNetworkResponseWithFileContent("product_listing_success.json", HttpURLConnection.HTTP_OK)
        productListingViewModel.getProducts()
        mockWebServer.takeRequest(2000, TimeUnit.MILLISECONDS)
        Assert.assertEquals(true, productListingViewModel.productsList.isNotEmpty())
    }

    @Test
    fun test_product_listing_failure_case() = runBlocking{
        mockNetworkResponseWithFileContent("product_listing_failure.json", HttpURLConnection.HTTP_BAD_GATEWAY)
        productListingViewModel.getProducts()
        mockWebServer.takeRequest(500, TimeUnit.MILLISECONDS)
        Assert.assertEquals(true, productListingViewModel.productsList.isEmpty())
        productListingViewModel.getError().observeForever{
            Assert.assertEquals("Failed to get products", it?.errorMessage)
        }
    }


}