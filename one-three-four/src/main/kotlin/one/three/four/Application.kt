package one.three.four

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("one.three.four")
                .mainClass(Application.javaClass)
                .start()
    }
}