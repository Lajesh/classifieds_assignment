package com.dubizzle.products;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.dubizzle.products.databinding.FragmentProductDetailsBindingImpl;
import com.dubizzle.products.databinding.FragmentProductListingBindingImpl;
import com.dubizzle.products.databinding.ItemLayoutProductBindingImpl;
import com.dubizzle.products.databinding.ProgressLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTPRODUCTDETAILS = 1;

  private static final int LAYOUT_FRAGMENTPRODUCTLISTING = 2;

  private static final int LAYOUT_ITEMLAYOUTPRODUCT = 3;

  private static final int LAYOUT_PROGRESSLAYOUT = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dubizzle.products.R.layout.fragment_product_details, LAYOUT_FRAGMENTPRODUCTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dubizzle.products.R.layout.fragment_product_listing, LAYOUT_FRAGMENTPRODUCTLISTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dubizzle.products.R.layout.item_layout_product, LAYOUT_ITEMLAYOUTPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dubizzle.products.R.layout.progress_layout, LAYOUT_PROGRESSLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTPRODUCTDETAILS: {
          if ("layout/fragment_product_details_0".equals(tag)) {
            return new FragmentProductDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTLISTING: {
          if ("layout/fragment_product_listing_0".equals(tag)) {
            return new FragmentProductListingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product_listing is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLAYOUTPRODUCT: {
          if ("layout/item_layout_product_0".equals(tag)) {
            return new ItemLayoutProductBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_layout_product is invalid. Received: " + tag);
        }
        case  LAYOUT_PROGRESSLAYOUT: {
          if ("layout/progress_layout_0".equals(tag)) {
            return new ProgressLayoutBindingImpl(component, new View[]{view});
          }
          throw new IllegalArgumentException("The tag for progress_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case LAYOUT_PROGRESSLAYOUT: {
          if("layout/progress_layout_0".equals(tag)) {
            return new ProgressLayoutBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for progress_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(5);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.dubizzle.core.DataBinderMapperImpl());
    result.add(new me.tatarka.bindingcollectionadapter2.DataBinderMapperImpl());
    result.add(new me.tatarka.bindingcollectionadapter2.recyclerview.DataBinderMapperImpl());
    result.add(new me.tatarka.bindingcollectionadapter2.viewpager2.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "itemViewModel");
      sKeys.put(2, "listener");
      sKeys.put(3, "showProgress");
      sKeys.put(4, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/fragment_product_details_0", com.dubizzle.products.R.layout.fragment_product_details);
      sKeys.put("layout/fragment_product_listing_0", com.dubizzle.products.R.layout.fragment_product_listing);
      sKeys.put("layout/item_layout_product_0", com.dubizzle.products.R.layout.item_layout_product);
      sKeys.put("layout/progress_layout_0", com.dubizzle.products.R.layout.progress_layout);
    }
  }
}
