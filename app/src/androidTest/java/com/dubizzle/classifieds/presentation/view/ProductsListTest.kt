package com.dubizzle.classifieds.presentation.view


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.dubizzle.classifieds.R
import com.dubizzle.core.utils.idlingresource.EspressoIdlingResource
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.hamcrest.core.IsInstanceOf
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class ProductsListTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setup(){
        IdlingRegistry.getInstance().register(EspressoIdlingResource.getIdlingResource())
    }

    @After
    fun tearDown(){
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.getIdlingResource());
    }


    @Test
    fun productsListTest() {

        val textView = onView(
            allOf(
                withId(R.id.tvName), withText("Notebook"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView.check(matches(isDisplayed()))

        val cardView = onView(
            allOf(
                childAtPosition(
                    childAtPosition(
                        withId(R.id.offers_listing),
                        2
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        cardView.perform(click())

        val textView2 = onView(
            allOf(
                withId(R.id.tvDetailName), withText("Monitor"),
                withParent(withParent(withId(R.id.nestedScroll))),
                isDisplayed()
            )
        )
        textView2.check(matches(withText("Monitor")))
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }

}
