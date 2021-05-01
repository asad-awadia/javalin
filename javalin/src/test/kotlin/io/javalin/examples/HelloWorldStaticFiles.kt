/*
 * Javalin - https://javalin.io
 * Copyright 2017 David Åse
 * Licensed under Apache 2.0: https://github.com/tipsy/javalin/blob/master/LICENSE
 */

package io.javalin.examples

import io.javalin.Javalin
import io.javalin.http.staticfiles.Location

fun main() {
    Javalin.create { it.addStaticFiles("/public", Location.CLASSPATH) }.start(7070)
}

