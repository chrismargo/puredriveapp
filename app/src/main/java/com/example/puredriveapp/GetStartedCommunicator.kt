package com.example.puredriveapp

import androidx.fragment.app.Fragment

@FunctionalInterface
interface GetStartedCommunicator {
    fun loadNextFragment(nextResource: Int, nextFragment: Fragment)
}