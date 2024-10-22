package com.cokimutai.posho

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform