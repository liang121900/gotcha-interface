package com.webcam.gotcha.filter;

import org.reactivestreams.Publisher;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.Filter;
import io.micronaut.http.filter.HttpServerFilter;
import io.micronaut.http.filter.ServerFilterChain;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.schedulers.Schedulers;

@Filter(value = "/**")
public class CorsFilter  implements HttpServerFilter {


    @Override
    public Publisher<MutableHttpResponse<?>> doFilter(HttpRequest<?> request, ServerFilterChain chain) {
        return Flowable.fromCallable(() -> {
            return true;
        }).subscribeOn(Schedulers.io()).switchMap(a -> chain.proceed(request)).doOnNext(res -> {
            res.getHeaders().add("Access-Control-Allow-Credentials","true");
            res.getHeaders().add("Access-Control-Allow-Methods","*");
            res.getHeaders().add("Access-Control-Allow-Origin","*");
            res.getHeaders().add("Access-Control-Allow-Headers","*");
        });
    }
}