package com.dubizzle.products.databinding;
import com.dubizzle.products.R;
import com.dubizzle.products.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProductListingBindingImpl extends FragmentProductListingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProductListingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentProductListingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[3]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[1]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.offersListing.setTag(null);
        this.pullRefreshLayout.setTag(null);
        this.shimmerContainer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.dubizzle.products.view.fragment.products.ProductListingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.dubizzle.products.view.fragment.products.ProductListingViewModel ViewModel) {
        updateRegistration(2, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLoadingEvent((com.dubizzle.core.arc.SingleLiveEvent<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelProductsList((androidx.databinding.ObservableArrayList<com.dubizzle.domain.entity.response.products.ProductsEntity.Product>) object, fieldId);
            case 2 :
                return onChangeViewModel((com.dubizzle.products.view.fragment.products.ProductListingViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLoadingEvent(com.dubizzle.core.arc.SingleLiveEvent<java.lang.Boolean> ViewModelLoadingEvent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelProductsList(androidx.databinding.ObservableArrayList<com.dubizzle.domain.entity.response.products.ProductsEntity.Product> ViewModelProductsList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(com.dubizzle.products.view.fragment.products.ProductListingViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int viewModelLoadingEventBooleanValueViewVISIBLEViewGONE = 0;
        com.dubizzle.core.arc.SingleLiveEvent<java.lang.Boolean> viewModelLoadingEvent = null;
        boolean viewModelLoadingEventBooleanValueViewModelSwipeRefreshBooleanFalse = false;
        me.tatarka.bindingcollectionadapter2.ItemBinding<com.dubizzle.domain.entity.response.products.ProductsEntity.Product> viewModelItemBinding = null;
        androidx.databinding.ObservableArrayList<com.dubizzle.domain.entity.response.products.ProductsEntity.Product> viewModelProductsList = null;
        java.lang.Boolean viewModelLoadingEventGetValue = null;
        boolean viewModelLoadingEventBooleanValue = false;
        com.dubizzle.products.view.fragment.products.ProductListingViewModel viewModel = mViewModel;
        boolean viewModelSwipeRefresh = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loadingEvent
                        viewModelLoadingEvent = viewModel.getLoadingEvent();
                    }
                    updateLiveDataRegistration(0, viewModelLoadingEvent);


                    if (viewModelLoadingEvent != null) {
                        // read viewModel.loadingEvent.getValue()
                        viewModelLoadingEventGetValue = viewModelLoadingEvent.getValue();
                    }


                    if (viewModelLoadingEventGetValue != null) {
                        // read viewModel.loadingEvent.getValue().booleanValue()
                        viewModelLoadingEventBooleanValue = viewModelLoadingEventGetValue.booleanValue();
                    }
                if((dirtyFlags & 0xdL) != 0) {
                    if(viewModelLoadingEventBooleanValue) {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewModel.loadingEvent.getValue().booleanValue() ? View.VISIBLE : View.GONE
                    viewModelLoadingEventBooleanValueViewVISIBLEViewGONE = ((viewModelLoadingEventBooleanValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.itemBinding
                        viewModelItemBinding = viewModel.getItemBinding();
                        // read viewModel.productsList
                        viewModelProductsList = viewModel.getProductsList();
                    }
                    updateRegistration(1, viewModelProductsList);
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {

                if (viewModel != null) {
                    // read viewModel.swipeRefresh
                    viewModelSwipeRefresh = viewModel.isSwipeRefresh();
                }
        }

        if ((dirtyFlags & 0xdL) != 0) {

                // read viewModel.loadingEvent.getValue().booleanValue() ? viewModel.swipeRefresh : false
                viewModelLoadingEventBooleanValueViewModelSwipeRefreshBooleanFalse = ((viewModelLoadingEventBooleanValue) ? (viewModelSwipeRefresh) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapters.setAdapter(this.offersListing, viewModelItemBinding, viewModelProductsList, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter)null, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter.ItemIds)null, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter.ViewHolderFactory)null, (androidx.recyclerview.widget.AsyncDifferConfig)null);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.pullRefreshLayout.setRefreshing(viewModelLoadingEventBooleanValueViewModelSwipeRefreshBooleanFalse);
            this.shimmerContainer.setVisibility(viewModelLoadingEventBooleanValueViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.loadingEvent
        flag 1 (0x2L): viewModel.productsList
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.loadingEvent.getValue().booleanValue() ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.loadingEvent.getValue().booleanValue() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.loadingEvent.getValue().booleanValue() ? viewModel.swipeRefresh : false
        flag 7 (0x8L): viewModel.loadingEvent.getValue().booleanValue() ? viewModel.swipeRefresh : false
    flag mapping end*/
    //end
}