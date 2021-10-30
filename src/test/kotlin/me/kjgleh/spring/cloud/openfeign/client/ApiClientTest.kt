package me.kjgleh.spring.cloud.openfeign.client

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class ApiClientTest {

    @Autowired
    private lateinit var apiClient: ApiClient

    @Test
    fun `sut returns correctly`() {
        // Arrange
        val sut = apiClient

        // Act
        val actual = sut.hello()

        // Assert
        assertThat(actual).isEqualTo("hello")
    }
}