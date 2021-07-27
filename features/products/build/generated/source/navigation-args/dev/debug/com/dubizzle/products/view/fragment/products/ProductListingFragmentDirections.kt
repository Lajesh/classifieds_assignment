package com.dubizzle.products.view.fragment.products

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.dubizzle.products.R

public class ProductListingFragmentDirections private constructor() {
  public companion object {
    public fun actionListingToDetails(): NavDirections =
        ActionOnlyNavDirections(R.id.action_listing_to_details)
  }
}
