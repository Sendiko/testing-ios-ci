package id.my.sendiko.testingiosci

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform