package com.github.b1412.user.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import javax.validation.constraints.NotBlank


@Configuration
@ConfigurationProperties("user")
data class UserApiProperties(
    @NotBlank
    var roleId: Long? = null,

    @NotBlank
    var branchId: Long? = null,

    @NotBlank
    var clientId: String? = null,

    @NotBlank
    var active: Boolean? = false

)
