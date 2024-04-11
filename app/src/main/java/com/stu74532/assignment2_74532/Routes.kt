package com.stu74532.assignment2_74532

sealed class Routes(val route: String) {
    object ScreenHome : Routes("screen_home")
    object OppenheimerScreen : Routes("oppenheimer_screen")

    fun withArgs(vararg args: Int): String {
        return buildString {
            append(route)
            args.forEach { args ->
                append("/$args")
            }
        }
    }
}