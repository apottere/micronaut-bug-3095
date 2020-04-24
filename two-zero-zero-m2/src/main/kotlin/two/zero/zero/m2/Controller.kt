package two.zero.zero.m2

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.reactivex.Flowable
import io.reactivex.Single

@Controller
class Controller {
	@Get("/test1")
	fun test1(): Single<HttpResponse<Flowable<ByteArray>>> {
		return Single.just(HttpResponse.ok(Flowable.empty()))
	}
	@Get("/test2")
	fun test2(): Single<HttpResponse<Flowable<ByteArray>>> {
		return Single.just(HttpResponse.ok(Flowable.just("".toByteArray())))
	}
}
