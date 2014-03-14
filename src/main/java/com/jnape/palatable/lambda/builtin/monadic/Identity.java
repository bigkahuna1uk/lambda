package com.jnape.palatable.lambda.builtin.monadic;

import com.jnape.palatable.lambda.MonadicFunction;

public final class Identity<A> extends MonadicFunction<A, A> {

    @Override
    public final A apply(A a) {
        return a;
    }

    public static <A> Identity<A> id() {
        return new Identity<A>();
    }
}